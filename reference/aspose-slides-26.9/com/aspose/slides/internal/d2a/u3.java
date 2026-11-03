package com.aspose.slides.internal.d2a;

import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.b7s.t2;
import java.awt.image.BufferedImage;
import java.util.Hashtable;

public class u3 {
   public static BufferedImage n5(BufferedImage var0, q0 var1) {
      float var2 = n5(var1);
      float var3 = l6(var1);
      if (var2 == 0.0F && var3 != 0.0F) {
         var2 = var3;
      }

      if (var3 == 0.0F && var2 != 0.0F) {
         var3 = var2;
      }

      Hashtable var4 = new Hashtable();
      if (var2 * var3 != 0.0F) {
         var4.put("dpiX", var2);
         var4.put("dpiY", var3);
      }

      if (n5(var1.e5().z1()) || l6(var1.e5().z1())) {
         var4.put("pixelFormat", 8207);
      }

      if (var0.getPropertyNames() != null) {
         for (String var8 : var0.getPropertyNames()) {
            var4.put(var8, var0.getProperty(var8));
         }
      }

      return var4.isEmpty() ? var0 : new BufferedImage(var0.getColorModel(), var0.getRaster(), var0.isAlphaPremultiplied(), var4);
   }

   public static float n5(q0 var0) {
      com.aspose.slides.internal.d0c.l6 var1 = var0.o0();
      if (var1 != null && var1.u9() != null && var0.o0().h0() != null) {
         float var2 = var0.o0().u9().k5();
         if (var1.u3() == 2) {
            return var2;
         }

         if (var1.u3() == 3) {
            return var2 * 2.45F;
         }
      }

      t2 var4 = var0.z7();
      if (var4 != null) {
         float var3 = var4.k5();
         if (var4.n5() == 1) {
            return var3;
         }

         if (var4.n5() == 2) {
            return var3 * 2.45F;
         }
      }

      return 0.0F;
   }

   public static float l6(q0 var0) {
      com.aspose.slides.internal.d0c.l6 var1 = var0.o0();
      if (var1 != null && var1.u9() != null && var0.o0().h0() != null) {
         float var2 = var0.o0().h0().k5();
         if (var1.u3() == 2) {
            return var2;
         }

         if (var1.u3() == 3) {
            return var2 * 2.45F;
         }
      }

      t2 var4 = var0.z7();
      if (var4 != null) {
         float var3 = var4.u3();
         if (var4.n5() == 1) {
            return var3;
         }

         if (var4.n5() == 2) {
            return var3 * 2.45F;
         }
      }

      return 0.0F;
   }

   public static boolean n5(int var0) {
      return com.aspose.slides.internal.t5g.u3.a6() && var0 == 2;
   }

   public static boolean l6(int var0) {
      return com.aspose.slides.internal.t5g.u3.a6() && var0 == 3;
   }
}
