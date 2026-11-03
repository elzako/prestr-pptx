package com.aspose.slides;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@Deprecated
public class HtmlExternalResolver implements IHtmlExternalResolver {
   private final com.aspose.slides.ms.System.Xml.k1 n5 = new com.aspose.slides.ms.System.Xml.k1();

   @Override
   public String resolveUri(String baseUri, String relativeUri) {
      try {
         return baseUri != null
            ? new com.aspose.slides.ms.System.r8(new com.aspose.slides.ms.System.r8(baseUri), relativeUri).toString()
            : new com.aspose.slides.ms.System.r8(relativeUri).toString();
      } catch (RuntimeException var4) {
         return null;
      }
   }

   @Override
   public InputStream getEntity(String absoluteUri) {
      return this.n5(absoluteUri).toInputStream();
   }

   com.aspose.slides.internal.z0k.t4 n5(String var1) {
      if (var1.length() > "data:".length() && "data:".equals(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.l6(var1, 0, "data:".length())))) {
         boolean var2 = false;
         int var3 = "data:".length();
         int var4 = var3;

         while (var4 < var1.length() && var1.charAt(var4) != ',' && var1.charAt(var4) != ';') {
            var4++;
         }

         while (var4 < var1.length() && var1.charAt(var4) == ';') {
            var4++;

            while (var4 < var1.length() && var1.charAt(var4) <= ' ') {
               var4++;
            }

            var3 = var4;

            while (var4 < var1.length() && var1.charAt(var4) != ',' && var1.charAt(var4) != ';') {
               var4++;
            }

            int var5 = var4;

            while (var3 < var5 && var1.charAt(var5 - 1) <= ' ') {
               var5--;
            }

            if ("base64".equals(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.l6(var1, var3, var5 - var3)))) {
               var2 = true;
            }
         }

         if (var4 < var1.length() && var1.charAt(var4) == ',') {
            var4++;
            if (var2) {
               return new com.aspose.slides.internal.z0k.e2(com.aspose.slides.ms.System.z3.s7(com.aspose.slides.ms.System.d1.k5(var1, var4)));
            }

            try {
               return new com.aspose.slides.internal.z0k.e2(URLDecoder.decode(com.aspose.slides.ms.System.d1.k5(var1, var4), "UTF-8").getBytes());
            } catch (UnsupportedEncodingException var6) {
               throw new RuntimeException(var6);
            }
         }
      }

      try {
         Object var8 = this.n5.n5(new com.aspose.slides.ms.System.r8(var1), "", com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class));
         return var8 instanceof com.aspose.slides.internal.z0k.t4 ? (com.aspose.slides.internal.z0k.t4)var8 : null;
      } catch (UnsupportedOperationException var7) {
         return null;
      }
   }
}
