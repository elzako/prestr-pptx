package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class o3i extends b3 {
   private double l6;
   private double k5;
   private float u3;
   private float a6;
   private float u9;
   private float h0;
   private float c8;
   private byte t2;
   private boolean s7;
   private g7 x8;
   public static final byte n5 = j6.n5("b");
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "blurRad", "dist", "dir", "sx", "sy", "kx", "ky", "algn", "rotWithShape", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr"
   );

   public o3i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n3();
      o3i$1 var2 = new o3i$1(this);
      n5(var1, var2);
      n5(var1, new o3i$2(this, var1));
   }

   public o3i() {
      this.n3();
   }

   private void n3() {
      this.l6 = 0.0;
      this.k5 = 0.0;
      this.u3 = 0.0F;
      this.a6 = 100.0F;
      this.u9 = 100.0F;
      this.h0 = 0.0F;
      this.c8 = 0.0F;
      this.t2 = n5;
      this.s7 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != 0.0) {
         var2.l6(
            "blurRad", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14))
         );
      }

      if (this.k5 != 0.0) {
         var2.l6("dist", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.k5 * 12700.0), 14)));
      }

      if (this.u3 != 0.0F) {
         var2.l6("dir", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u3 * 60000.0F), 14)));
      }

      if (this.a6 != 100.0F) {
         if (var2.n5) {
            var2.l6("sx", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.a6), "%"}));
         } else {
            var2.l6("sx", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.a6 * 1000.0F), 14)));
         }
      }

      if (this.u9 != 100.0F) {
         if (var2.n5) {
            var2.l6("sy", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.u9), "%"}));
         } else {
            var2.l6("sy", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u9 * 1000.0F), 14)));
         }
      }

      if (this.h0 != 0.0F) {
         var2.l6("kx", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.h0 * 60000.0F), 14)));
      }

      if (this.c8 != 0.0F) {
         var2.l6("ky", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.c8 * 60000.0F), 14)));
      }

      if (this.t2 != n5) {
         var2.l6("algn", j6.n5(this.t2));
      }

      if (!this.s7) {
         var2.l6("rotWithShape", this.s7 ? "1" : "0");
      }

      if (this.x8 != null) {
         switch (n3.n5(this.x8.n5())) {
            case 9:
               ((e4w)this.x8.k5()).n5("a", var2, this.x8.n5());
               break;
            case 10:
               ((e8p)this.x8.k5()).n5("a", var2, this.x8.n5());
               break;
            case 11:
               ((d0p)this.x8.k5()).n5("a", var2, this.x8.n5());
               break;
            case 12:
               ((s0i)this.x8.k5()).n5("a", var2, this.x8.n5());
               break;
            case 13:
               ((q4d)this.x8.k5()).n5("a", var2, this.x8.n5());
               break;
            case 14:
               ((x4a)this.x8.k5()).n5("a", var2, this.x8.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.x8 != null) {
         throw new Exception("Color already is initialized.");
      }

      switch (n3.n5(var1)) {
         case 9:
            this.x8 = new g7("scrgbClr", new e4w());
            break;
         case 10:
            this.x8 = new g7("srgbClr", new e8p());
            break;
         case 11:
            this.x8 = new g7("hslClr", new d0p());
            break;
         case 12:
            this.x8 = new g7("sysClr", new s0i());
            break;
         case 13:
            this.x8 = new g7("schemeClr", new q4d());
            break;
         case 14:
            this.x8 = new g7("prstClr", new x4a());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.x8;
   }

   public final double n5() {
      return this.l6;
   }

   public final void n5(double var1) {
      this.l6 = var1;
   }

   public final double l6() {
      return this.k5;
   }

   public final void l6(double var1) {
      this.k5 = var1;
   }

   public final float k5() {
      return this.u3;
   }

   public final void n5(float var1) {
      this.u3 = var1;
   }

   public final float u3() {
      return this.a6;
   }

   public final void l6(float var1) {
      this.a6 = var1;
   }

   public final float a6() {
      return this.u9;
   }

   public final void k5(float var1) {
      this.u9 = var1;
   }

   public final float u9() {
      return this.h0;
   }

   public final void u3(float var1) {
      this.h0 = var1;
   }

   public final float h0() {
      return this.c8;
   }

   public final void a6(float var1) {
      this.c8 = var1;
   }

   public final byte c8() {
      return this.t2;
   }

   public final void n5(byte var1) {
      this.t2 = var1;
   }

   public final boolean t2() {
      return this.s7;
   }

   public final void n5(boolean var1) {
      this.s7 = var1;
   }

   public final g7 s7() {
      return this.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 x8() {
      return n3;
   }

   // $VF: synthetic method
   static double n5(o3i var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double l6(o3i var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static float n5(o3i var0, float var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static float l6(o3i var0, float var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static float k5(o3i var0, float var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static float u3(o3i var0, float var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static float a6(o3i var0, float var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static byte n5(o3i var0, byte var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean n5(o3i var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static g7 n5(o3i var0, g7 var1) {
      return var0.x8 = var1;
   }
}
