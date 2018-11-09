Prerequisites
-------------
Linux, Mac OS, or Windows (verified using Ubuntu 16.04 LTS)
Node.js 8 LTS, see https://nodejs.org (verified using Node.js v8.11.1)
node-canvas 2.x, see https://github.com/Automattic/node-canvas (verified using v2.0.0-alpha.12)

Running
-------
Trying out:
node server.js bindIp=127.0.0.1 port=8080
(defaults to 0.0.0.0:8080 if bindIp / port are omitted)

Production:
We recommend PM2 Runtime (http://pm2.keymetrics.io/docs/usage/quick-start/) for running the application in the
background and across restarts, you can of course also use systemd, or put the software in a Docker image etc
pm2 start server.js

Generating Diagrams
-------------------
HTTP POST with diagram source as text/plain to:
* http://<bindIp>:<port>/api/v7/generateDiagramImage (for image)
* http://<bindIp>:<port>/api/v7/generateDiagramBase64 (for base64 encoded image)
* http://<bindIp>:<port>/api/v7/generateDiagramDataUrl (for Data URL of image)

Query parameters:
* mimeType - image/png, image/jpeg, image/svg+xml (defaults to image/png)
* scale - float number (defaults to 1.0)
* quality - float number only valid for image/jpeg (defaults to 1.0 (maximum))

Examples:
POST /api/v7/generateDiagramImage (png image of scale 1.0)
POST /api/v7/generateDiagramImage?mimeType=image/jpeg&quality=0.7&scale=1.5 (jpg image with quality 0.7 and scale 1.5)
POST /api/v7/generateDiagramBase64 (base64 encoded png image of scale 1.0)
POST /api/v7/generateDiagramDataUrl?mimeType=image/svg+xml (data URL for svg image)