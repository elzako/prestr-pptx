package com.aspose.slides;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ExternalResourceResolver implements IExternalResourceResolver {
   private final com.aspose.slides.ms.System.Xml.k1 m_xmlUrlResolver = new com.aspose.slides.ms.System.Xml.k1();

   @Override
   public String resolveUri(String baseUri, String relativeUri) {
      try {
         return this.m_xmlUrlResolver.n5(new com.aspose.slides.ms.System.r8(baseUri), relativeUri).toString();
      } catch (RuntimeException var4) {
         com.aspose.slides.internal.n8e.v4.n5(var4);
         return null;
      }
   }

   @Override
   public InputStream getEntity(String absoluteUri) {
      return this.getEntityInternal(absoluteUri).toInputStream();
   }

   com.aspose.slides.internal.z0k.t4 getEntityInternal(String absoluteUri) {
      try {
         com.aspose.slides.ms.System.r8 var2 = new com.aspose.slides.ms.System.r8(absoluteUri);
         if (var2.z3()) {
            return (com.aspose.slides.internal.z0k.t4)this.m_xmlUrlResolver
               .n5(new com.aspose.slides.ms.System.r8(absoluteUri), "", com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class));
         }
      } catch (RuntimeException var21) {
         com.aspose.slides.internal.n8e.v4.n5(var21);
      }

      try {
         URLConnection var27 = new URL(absoluteUri).openConnection();
         boolean var3 = false;
         if (var27 instanceof HttpURLConnection) {
            int var4 = ((HttpURLConnection)var27).getResponseCode();
            if (var4 != 200 && (var4 == 302 || var4 == 301 || var4 == 303)) {
               var3 = true;
            }

            if (var3) {
               String var5 = var27.getHeaderField("Location");
               String var6 = var27.getHeaderField("Set-Cookie");
               var27 = new URL(var5).openConnection();
               var27.setRequestProperty("Cookie", var6);
            }
         }

         try {
            com.aspose.slides.internal.z0k.t4 var28 = com.aspose.slides.internal.z0k.t4.fromJava(var27.getInputStream());

            try {
               byte[] var29 = com.aspose.slides.internal.q7.n5.n5(var28);
               return new com.aspose.slides.internal.z0k.e2(var29);
            } finally {
               if (var28 != null) {
                  var28.dispose();
               }
            }
         } finally {
            if (var27.getInputStream() != null) {
               var27.getInputStream().close();
            }

            if (var27 != null && var27 instanceof HttpURLConnection) {
               ((HttpURLConnection)var27).disconnect();
            }
         }
      } catch (MalformedURLException var24) {
         com.aspose.slides.internal.n8e.v4.n5(var24);
         return null;
      } catch (IOException var25) {
         com.aspose.slides.internal.n8e.v4.n5(var25);
         return null;
      } catch (RuntimeException var26) {
         com.aspose.slides.internal.n8e.v4.n5(var26);
         return null;
      }
   }
}
