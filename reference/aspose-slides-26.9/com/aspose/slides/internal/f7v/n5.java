package com.aspose.slides.internal.f7v;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class n5 {
   public static final byte[] n5 = n5("IHDR");
   public static final byte[] l6 = n5("PLTE");
   public static final byte[] k5 = n5("IDAT");
   public static final byte[] u3 = n5("IEND");

   public static byte[] n5(String var0) {
      return com.aspose.slides.internal.c5e.h0.n5.u3(var0);
   }

   public static String n5(byte[] var0) {
      return com.aspose.slides.internal.c5e.h0.n5.l6(var0);
   }

   public static String n5(byte[] var0, int var1, int var2) {
      return com.aspose.slides.internal.c5e.h0.n5.l6(var0, var1, var2);
   }

   public static String l6(byte[] var0) {
      return com.aspose.slides.internal.c5e.h0.l6.l6(var0);
   }

   public static String l6(byte[] var0, int var1, int var2) {
      return com.aspose.slides.internal.c5e.h0.l6.l6(var0, var1, var2);
   }

   public static boolean l6(String var0) {
      return Character.isUpperCase(var0.charAt(0));
   }

   public static boolean k5(String var0) {
      return Character.isUpperCase(var0.charAt(1));
   }

   public static boolean u3(String var0) {
      return !Character.isUpperCase(var0.charAt(3));
   }

   public static int k5(byte[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         if (var0[var1] == 0) {
            return var1;
         }
      }

      return -1;
   }

   public static boolean n5(String var0, k5 var1) {
      if (l6(var0)) {
         return true;
      }

      boolean var2 = s7.n5(var0);
      switch (var1) {
         case LOAD_CHUNK_ALWAYS:
            return true;
         case LOAD_CHUNK_IF_SAFE:
            return var2 || u3(var0);
         case LOAD_CHUNK_KNOWN:
            return var2;
         case LOAD_CHUNK_NEVER:
            return false;
         default:
            return false;
      }
   }

   public static byte[] n5(byte[] var0, int var1, int var2, boolean var3) {
      try {
         ByteArrayInputStream var4 = new ByteArrayInputStream(var0, var1, var2);
         InputStream var5 = var3 ? var4 : new InflaterInputStream(var4);
         ByteArrayOutputStream var6 = new ByteArrayOutputStream();
         OutputStream var7 = var3 ? new DeflaterOutputStream(var6) : var6;
         n5(var5, var7);
         var5.close();
         var7.close();
         return var6.toByteArray();
      } catch (Exception var8) {
         throw new com.aspose.slides.internal.c5e.e2(var8);
      }
   }

   private static void n5(InputStream var0, OutputStream var1) throws IOException {
      byte[] var2 = new byte[1024];

      int var3;
      while ((var3 = var0.read(var2)) > 0) {
         var1.write(var2, 0, var3);
      }
   }

   public static List<s7> n5(List<s7> var0, u3 var1) {
      ArrayList var2 = new ArrayList();

      for (s7 var4 : var0) {
         if (var1.n5(var4)) {
            var2.add(var4);
         }
      }

      return var2;
   }
}
