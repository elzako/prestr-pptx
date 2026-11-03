package com.aspose.slides.internal.g7;

public class q5v extends b4 {
   private c4i a6;
   private long u9;
   private z9 h0;
   private v2 c8;
   private Object t2 = new Object();
   private Object s7 = new Object();
   private String x8;
   private String n3;
   private String y4;
   private double e2;
   private double t9;
   private double z1;
   private double t4;
   private double q0;
   public double k5 = -Double.MAX_VALUE;
   public double u3 = -Double.MAX_VALUE;
   private double z3;
   private double m1;

   public q5v(c4i var1) {
      this.a6 = var1;
   }

   public final String a6() {
      return this.x8;
   }

   public final void n5(String var1) {
      this.x8 = var1;
   }

   public final void l6(String var1) {
      this.n3 = var1;
   }

   public final void k5(String var1) {
      this.y4 = var1;
   }

   public final void l6(double var1) {
      this.e2 = var1;
   }

   public final void k5(double var1) {
      this.t9 = var1;
   }

   public final void u3(double var1) {
      this.z1 = var1;
   }

   public final void a6(double var1) {
      this.t4 = var1;
   }

   public final void u9(double var1) {
      this.q0 = var1;
   }

   @Override
   public double n5() {
      if (this.u3 == -Double.MAX_VALUE) {
         this.u3 = this.l6().l6();
      }

      return this.u3;
   }

   public final void h0(double var1) {
      this.z3 = var1;
   }

   public final void c8(double var1) {
      this.m1 = var1;
   }

   @Override
   public z9 l6() {
      if (this.h0 == null) {
         synchronized (this.t2) {
            if (this.h0 == null) {
               if (!com.aspose.slides.internal.v6g.k5.l6(this.a6, v7o.class)) {
                  this.h0 = new z9(this.a6.n5().a6().n5()[0], this.a6.n5().a6().n5()[1], this.a6.n5().a6().n5()[2], this.a6.n5().a6().n5()[3]);
               } else {
                  this.h0 = new z9();
               }
            }
         }
      }

      return this.h0;
   }

   @Override
   public void n5(z9 var1) {
      this.h0 = var1;
   }

   @Override
   public v2 k5() {
      if (this.c8 == null) {
         synchronized (this.s7) {
            if (this.c8 == null) {
               if (!com.aspose.slides.internal.v6g.k5.l6(this.a6, v7o.class)) {
                  this.c8 = new v2(this.a6.n5().u3().n5());
               } else {
                  this.c8 = new v2();
               }
            }
         }
      }

      return this.c8;
   }

   @Override
   public long u3() {
      if (this.u9 == 0L) {
         synchronized (this.t2) {
            if (this.u9 == 0L) {
               if (!com.aspose.slides.internal.v6g.k5.l6(this.a6, v7o.class)) {
                  this.u9 = com.aspose.slides.internal.v6g.k5.a6(1.0 / this.a6.n5().u3().n5()[0], 14);
               } else {
                  this.u9 = 1000L;
               }
            }
         }
      }

      return this.u9;
   }

   @Override
   public int k5(r9 var1) {
      k3 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, k3.class);
      return var2 != null ? var2.n5().hashCode() : var1.hashCode();
   }

   @Override
   public double l6(r9 var1) {
      double var2 = super.l6(var1);
      if (var2 == 0.0 && !com.aspose.slides.internal.v6g.k5.l6(this.a6, v7o.class)) {
         k6 var4 = this.a6.n5(var1);
         if (var4 != null) {
            return var4.t2();
         }
      }

      return var2;
   }
}
