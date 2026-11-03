package com.aspose.slides.internal.n8e;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

class b3 implements o0 {
   private String n5;
   private String l6;

   public b3(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void n5(StringBuilder var1, Map<String, String> var2) {
      String var3 = var1.toString();
      if (var3.startsWith("http")) {
         try {
            URL var4 = new URL(var3);
            var1.append(var4.getQuery() == null ? "?" : "&").append("clientkey=").append(this.n5);
            String var5 = this.n5(var1.toString());
            var1.append("&signature=").append(var5);
         } catch (MalformedURLException var6) {
            v4.n5(var6);
         }
      } else {
         this.n5(var3, var2);
      }
   }

   private void n5(String var1, Map<String, String> var2) {
      String var3 = this.n5(var1);
      var2.put("clientkey", this.n5);
      var2.put("signature", var3);
   }

   @Override
   public String n5(byte[] var1) {
      try {
         Mac var2 = Mac.getInstance("HmacSHA512");
         var2.init(new SecretKeySpec(this.l6.getBytes("UTF-8"), "HmacSHA512"));
         String var3 = new String(u9.n5(var2.doFinal(var1)), "UTF-8");
         return l6(var3);
      } catch (UnsupportedEncodingException var4) {
         v4.n5(var4);
      } catch (NoSuchAlgorithmException var5) {
         v4.n5(var5);
      } catch (InvalidKeyException var6) {
         v4.n5(var6);
      }

      return null;
   }

   private String n5(String var1) {
      try {
         Mac var2 = Mac.getInstance("HmacSHA512");
         var2.init(new SecretKeySpec(this.l6.getBytes("UTF-8"), "HmacSHA512"));
         String var3 = new String(u9.n5(var2.doFinal(var1.toLowerCase().getBytes("UTF-8"))), "UTF-8");
         return l6(var3);
      } catch (UnsupportedEncodingException var4) {
         v4.n5(var4);
      } catch (NoSuchAlgorithmException var5) {
         v4.n5(var5);
      } catch (InvalidKeyException var6) {
         v4.n5(var6);
      }

      return null;
   }

   private static String l6(String var0) {
      var0 = var0.replaceAll("\\+", "-").replaceAll("\\/", "_");

      while (var0.endsWith("=")) {
         var0 = var0.substring(0, var0.length() - 1);
      }

      return var0;
   }
}
