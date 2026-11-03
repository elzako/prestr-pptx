package com.aspose.slides.internal.l1;

import com.aspose.slides.internal.i7.c8;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o8m.d5;
import com.aspose.slides.ms.System.e2;
import java.net.HttpURLConnection;
import java.net.URL;

public class n5 extends k5 {
   private final String n5;

   public n5(String var1) {
      this.n5 = var1;
   }

   @Override
   protected HttpURLConnection n5(com.aspose.slides.internal.i7.n5 var1) {
      try {
         URL var2 = new URL(this.n5);
         HttpURLConnection var3 = (HttpURLConnection)var2.openConnection();
         var3.setRequestMethod("POST");
         var3.setRequestProperty("Content-Type", "application/json");
         String var4 = var1.l6();
         long var5 = System.currentTimeMillis() / 1000L;
         String var7 = String.valueOf(var5);
         String var8 = n5(n5(), var4 + var7);
         var3.setRequestProperty("X-Timestamp", var7);
         var3.setRequestProperty("X-Signature", var8);
         return var3;
      } catch (Exception var9) {
         throw new c8("Failed to establish connection: " + var9.getMessage());
      }
   }

   private static String n5(byte[] var0, String var1) {
      byte[] var2 = j5.z3().u3(var1);
      d5 var3 = new d5(var0);

      try {
         return n5(var3.l6(var2));
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private static String n5(byte[] var0) {
      a5 var1 = new a5(var0.length * 2);

      for (byte var5 : var0) {
         var1.n5(e2.n5(var5, "x2"));
      }

      return var1.toString();
   }

   private static byte[] n5() {
      byte var0 = 90;
      byte[] var1 = new byte[]{-66, 82, -17, -94, -40, -52, -127, -86};
      byte[] var2 = new byte[]{31, 74, -80, 42, 17, -103, -11, -45};
      byte[] var3 = new byte[]{-116, -8, 49, 64, 78, 29, -40, 69};
      byte[] var4 = new byte[]{-44, -57, 77, -80, -122, 63, -56, -71};
      byte[] var5 = new byte[32];

      for (int var6 = 0; var6 < var1.length; var6++) {
         var5[var6] = (byte)(var1[var6] & 0xFF ^ var0);
      }

      for (int var7 = 0; var7 < var2.length; var7++) {
         var5[var7 + 8] = (byte)(var2[var7] & 0xFF ^ var0);
      }

      for (int var8 = 0; var8 < var3.length; var8++) {
         var5[var8 + 16] = (byte)(var3[var8] & 0xFF ^ var0);
      }

      for (int var9 = 0; var9 < var4.length; var9++) {
         var5[var9 + 24] = (byte)(var4[var9] & 0xFF ^ var0);
      }

      return var5;
   }
}
