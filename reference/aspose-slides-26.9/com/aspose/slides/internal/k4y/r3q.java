package com.aspose.slides.internal.k4y;

public class r3q extends b3 {
   private String n5;
   private String l6;
   private long k5;
   private byte u3;
   private int a6;
   private long u9;
   private boolean h0;
   private g7 c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "shapeCheckSum", "textCheckSum", "shapeId", "fHybridRaster", "rot", "ver", "convChart", "bounds", "effectOffsets", "preciseEffectOffsets", "xlAnchor"
   );

   public r3q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      r3q$1 var2 = new r3q$1(this);
      n5(var1, var2);
      n5(var1, new r3q$2(this, var1));
   }

   public r3q() {
      this.u3();
   }

   private void u3() {
      this.k5 = 4294967295L;
      this.u3 = -1;
      this.a6 = 0;
      this.u9 = 0L;
      this.h0 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("a", var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      var2.l6("shapeCheckSum", this.n5);
      if (this.l6 != null) {
         var2.l6("textCheckSum", this.l6);
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("shapeId", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3 != -1) {
         var2.l6("fHybridRaster", this.u3 == 1 ? "1" : "0");
      }

      if (this.a6 != 0) {
         var2.l6("rot", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      }

      if ((this.u9 & 4294967295L) != 0L) {
         var2.l6("ver", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if (this.h0) {
         var2.l6("convChart", this.h0 ? "1" : "0");
      }

      if (this.c8 != null) {
         switch (t2.n5(this.c8.n5())) {
            case 7:
               ((n4)this.c8.k5()).n5("a", var2, this.c8.n5());
               break;
            case 8:
               ((p6r)this.c8.k5()).n5("a", var2, this.c8.n5());
               break;
            case 9:
               ((e6a)this.c8.k5()).n5("a", var2, this.c8.n5());
               break;
            case 10:
               ((u2w)this.c8.k5()).n5("a", var2, this.c8.n5());
         }
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final void n5(byte var1) {
      this.u3 = var1;
   }

   public final void l6(long var1) {
      this.u9 = var1;
   }

   public final void n5(g7 var1) {
      this.c8 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(r3q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(r3q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(r3q var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte n5(r3q var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(r3q var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long l6(r3q var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean n5(r3q var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static g7 n5(r3q var0, g7 var1) {
      return var0.c8 = var1;
   }
}
