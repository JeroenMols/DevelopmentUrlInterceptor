# DevelopmentUrlInterceptor
Intercept development URLs and open them in a specific browser

VPN's are great, but they tend to block MDNS making it difficult to access your development server from your mobile phone running a VPN. This app fixes that by intercepting local development URLs and redirecting them to a different browser instead.

How to get started:

- In your VPN settings, exclude a particular browser (your non main browser) from the VPN
- Configure this application to open all local development URLs in that browser
  - Change your local [development url here](https://github.com/JeroenMols/DevelopmentUrlInterceptor/blob/f594ad171e70c34e6eacef2639db3f60b6752b6a/app/src/main/AndroidManifest.xml#L31)
  - Set the package name of your [development browser here](https://github.com/JeroenMols/DevelopmentUrlInterceptor/blob/f594ad171e70c34e6eacef2639db3f60b6752b6a/app/src/main/java/com/jeroenmols/urlinterceptor/InterceptUrlActivity.kt#L14)
