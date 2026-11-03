package com.aspose.slides.internal.k4y;

public class u1v extends b3 {
   private String l6;
   private long k5;
   private byte u3;
   private long a6;
   private long u9;
   private boolean h0;
   private h2d c8;
   private String t2;
   private h7x s7;
   private l0k x8;
   public static final byte n5 = l4.n5("n");
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9("r", "s", "t", "cm", "vm", "ph", "f", "v", "is", "extLst");

   public u1v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      u1v$1 var2 = new u1v$1(this);
      n5(var1, var2);
      n5(var1, new u1v$2(this, var1));
   }

   public u1v() {
      this.h0();
   }

   private void h0() {
      this.k5 = 0L;
      this.u3 = n5;
      this.a6 = 0L;
      this.u9 = 0L;
      this.h0 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("r", this.l6);
      }

      if ((this.k5 & 4294967295L) != 0L) {
         var2.l6("s", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3 != n5) {
         var2.l6("t", l4.n5(this.u3));
      }

      if ((this.a6 & 4294967295L) != 0L) {
         var2.l6("cm", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      if ((this.u9 & 4294967295L) != 0L) {
         var2.l6("vm", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if (this.h0) {
         var2.l6("ph", this.h0 ? "1" : "0");
      }

      if (this.c8 != null) {
         this.c8.n5("ssml", var2, "f");
      }

      if (this.t2 != null) {
         this.n5("ssml", var2, "v", this.t2, true);
      }

      if (this.s7 != null) {
         this.s7.n5("ssml", var2, "is");
      }

      if (this.x8 != null) {
         this.x8.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(h2d var1) {
      this.c8 = var1;
   }

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final long l6() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final byte k5() {
      return this.u3;
   }

   public final void n5(byte var1) {
      this.u3 = var1;
   }

   public final h2d u3() {
      return this.c8;
   }

   public final String a6() {
      return this.t2;
   }

   public final void l6(String var1) {
      this.t2 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return n3;
   }

   // $VF: synthetic method
   static String n5(u1v var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(u1v var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte n5(u1v var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long l6(u1v var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long k5(u1v var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean n5(u1v var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static h2d n5(u1v var0, h2d var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String l6(u1v var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String n5(u1v var0) {
      return var0.t2;
   }

   // $VF: synthetic method
   static h7x n5(u1v var0, h7x var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static l0k n5(u1v var0, l0k var1) {
      return var0.x8 = var1;
   }
}
