package com.aspose.slides.internal.n8e;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;

class p8 {
   private String a6 = null;
   private o0 u9 = null;
   private static boolean h0;
   private static p8 c8 = null;
   protected static String n5 = "POST";
   protected static String l6 = "GET";
   protected static String k5 = "PUT";
   protected static String u3 = "DELETE";

   public static p8 n5(o0 var0, String var1, boolean var2) {
      p8 var3 = new p8();
      var3.n5(var0);
      if (var1 != null && var1.length() > 0) {
         if ("/".equals(var1.substring(var1.length() - 1))) {
            var1 = var1.substring(0, var1.length() - 1);
         }

         var3.n5(var1);
      }

      var3.n5(var2);
      c8 = var3;
      return var3;
   }

   private void n5(o0 var1) {
      this.u9 = var1;
   }

   private String n5() {
      return this.a6;
   }

   public void n5(String var1) {
      this.a6 = var1;
   }

   public String n5(String var1, String var2, Map<String, String> var3, String var4, Map<String, String> var5) throws s3 {
      if (this.n5() != null && this.n5().length() != 0) {
         StringBuilder var41 = new StringBuilder(this.n5()).append(var1);
         if (var3.keySet().size() > 0) {
            boolean var7 = true;
            String var8 = "?";

            for (String var10 : var3.keySet()) {
               if (var7) {
                  var7 = false;
               } else {
                  var8 = "&";
               }

               var41.append(var8).append(var10).append("=").append((String)var3.get(var10));
            }
         }

         HashMap var42 = new HashMap();
         if (var2.equals(l6) && this.u9 != null) {
            this.u9.n5(var41, var42);
         }

         URL var43 = null;

         try {
            var43 = new URL(var41.toString());
         } catch (Exception var36) {
            throw new s3(0, var36.getMessage());
         }

         String var45 = UUID.randomUUID().toString();
         SimpleDateFormat var46 = new SimpleDateFormat("MMddyyhhmm");
         String var11 = var46.format(Calendar.getInstance().getTime());
         String var12 = var11 + "," + var45;
         HttpsURLConnection var13 = null;

         try {
            var13 = (HttpsURLConnection)var43.openConnection();
            var13.setConnectTimeout(0);
            var13.setRequestProperty("Content-Type", "application/xml");
            var13.setRequestProperty("User-agent", i1.n5());
            if (var2.equals(l6)) {
               var13.setRequestProperty("nonce", var12);
               var13.setRequestMethod("GET");
            } else if (var2.equals(n5)) {
               String var47 = var4;
               this.n5(var42, var13, var47);
               var13.setRequestMethod("POST");
               var13.setDoOutput(true);
               OutputStream var50 = var13.getOutputStream();
               BufferedWriter var16 = new BufferedWriter(new OutputStreamWriter(var50, "UTF-8"));
               var16.write(var47);
               var16.flush();
               var16.close();
               var50.close();
            } else if (var2.equals(k5)) {
               String var48 = var4;
               this.n5(var42, var13, var48);
               var13.setRequestMethod("PUT");
               var13.setDoOutput(true);
               OutputStream var51 = var13.getOutputStream();
               BufferedWriter var53 = new BufferedWriter(new OutputStreamWriter(var51, "UTF-8"));
               var53.write(var48);
               var53.flush();
               var53.close();
               var51.close();
            } else if (var2.equals(u3)) {
               var13.setRequestMethod("DELETE");
            }

            InputStream var49 = var13.getInputStream();
            ByteArrayOutputStream var52 = new ByteArrayOutputStream();
            byte[] var17 = new byte[1024];

            int var54;
            while ((var54 = var49.read(var17, 0, var17.length)) != -1) {
               var52.write(var17, 0, var54);
            }

            var52.flush();
            byte[] var18 = var52.toByteArray();
            var49.close();
            var52.close();
            int var19 = var13.getResponseCode();
            if (var19 != 200 && var19 != 202 && var19 != 201) {
               throw new s3(var19, new String(var18, "utf8"));
            }

            String var20 = new String(var18, "utf8");
            if (var2.equals(l6)) {
               String var21 = var13.getHeaderField("nonce");
               if (var21 == null || !var21.equals(var12)) {
                  throw new s3(401, "not allowed");
               }

               String var22 = var13.getHeaderField("signature");
               if (var22 == null) {
                  throw new s3(401, "not allowed");
               }

               byte[] var23 = var20.getBytes("utf8");
               if (var23 == null) {
                  throw new s3(401, "not allowed");
               }

               byte[] var24 = var11.getBytes("utf8");
               byte[] var25 = var45.getBytes("utf8");
               byte[] var26 = new byte[var23.length + var24.length + var25.length];
               System.arraycopy(var23, 0, var26, 0, var23.length);
               System.arraycopy(var24, 0, var26, 0, var24.length);
               System.arraycopy(var25, 0, var26, 0, var25.length);
               if (this.u9 == null) {
                  throw new s3(401, "not allowed");
               }

               String var27 = this.u9.n5(var26);
               if (!var27.equals(var22)) {
                  throw new s3(401, "not allowed");
               }
            }

            return var20;
         } catch (s3 var37) {
            throw var37;
         } catch (IOException var38) {
            IOException var14 = var38;
            if (var13 != null) {
               try {
                  int var15 = var13.getResponseCode();
                  throw new s3(var15, var14.getMessage());
               } catch (IOException var35) {
                  throw new IllegalStateException(var38.getMessage() + "\r\n" + var35.getMessage());
               }
            } else {
               throw new IllegalStateException(var38.getMessage());
            }
         } catch (Exception var39) {
            throw new s3(999, var39.getMessage());
         } finally {
            ;
         }
      } else {
         String[] var6 = new String[]{this.n5()};
         throw new s3(1005, var6);
      }
   }

   private void n5(Map<String, String> var1, HttpsURLConnection var2, Object var3) {
      if (this.u9 != null) {
         var1.clear();
         this.u9.n5(new StringBuilder((String)var3), var1);

         for (String var5 : var1.keySet()) {
            var2.setRequestProperty(var5, (String)var1.get(var5));
         }
      }
   }

   public static String l6(String var0) {
      var0 = var0 == null ? "" : var0;
      return k5(var0);
   }

   public static String n5(Long var0) {
      String var1 = var0.toString();
      return k5(var1);
   }

   private static String k5(String var0) {
      return var0;
   }

   public void n5(boolean var1) {
      h0 = var1;
   }
}
