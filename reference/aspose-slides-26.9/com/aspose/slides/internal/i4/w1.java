package com.aspose.slides.internal.i4;

public final class w1 extends j4 {
   private com.aspose.slides.ms.System.j5 u3 = new com.aspose.slides.ms.System.j5();
   public static final long n5 = new com.aspose.slides.ms.System.j5(1970, 1, 1, 0, 0, 0, 1L).n3();

   @Override
   public Object C_() {
      return this.u3;
   }

   @Override
   public void n5(Object var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.ms.System.j5.class)) {
         com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.j5.class).u3(this.u3);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Double.class)) {
         c4.n5((double)(com.aspose.slides.internal.v6g.k5.u3(var1, double.class))).u3(this.u3);
      }
   }

   @Override
   public double l6() {
      return n5(this.u3.m3());
   }

   public static double n5(com.aspose.slides.ms.System.j5 var0) {
      return (var0.k7().n3() - n5) / 10000L;
   }

   @Override
   public String toString() {
      return this.u3.q0().n5("ddd, dd MMM yyyy HH':'mm':'ss 'GMT'zzz", com.aspose.slides.internal.x7n.l6.k5());
   }

   @Override
   public Object D_() {
      return this.u3;
   }

   @Override
   public String u3() {
      return "Date";
   }

   public w1(com.aspose.slides.ms.System.j5 var1, j4 var2) {
      super(var2);
      var1.u3(this.u3);
   }

   public w1(double var1, j4 var3) {
      this(c4.n5(var1).m3(), var3);
   }
}
