package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.NotImplementedException;

public class h3r extends u0a implements c6, d3, l1, o3 {
   private u0a n5;
   private n0 l6;
   private w4 k5;
   private Object u3 = new Object();
   private boolean a6;

   public h3r(u0a var1) {
      super(var1.x8(), d7u.n5(var1.l6()));
      this.n5(var1);
      this.l6 = new n0();
      this.l6.n5.n5(this);
      this.l6.l6.n5(this);
      this.l6.k5.n5(this);
      this.k5 = new w4();
      this.k5.k5();
      if (this.l6().h0() != null) {
         ((b1r)this.l6().h0()).n5(this);
      }

      if (this.l6().u9() != null) {
         ((y2o)this.l6().u9()).n5(this);
      }
   }

   @Override
   public String u3() {
      return this.n5.u3();
   }

   @Override
   public String h0() {
      return this.n5.h0();
   }

   @Override
   public int c8() {
      return this.n5.c8();
   }

   @Override
   public String u9() {
      return this.n5.u9();
   }

   @Override
   public p0 z1() {
      return this.n5.z1();
   }

   @Override
   public v7 s7() {
      return this.n5.s7();
   }

   @Override
   public final n0 y4() {
      return this.l6;
   }

   public final w4 k7() {
      return this.k5;
   }

   @Override
   public i2 e2() {
      return this.m3();
   }

   @Override
   public k6 n5(r9 var1) {
      return this.y4().l6(var1) ? super.n5(var1) : null;
   }

   private i2 m3() {
      if (!this.a6) {
         synchronized (this.u3) {
            if (!this.a6) {
               throw new NotImplementedException();
            }
         }
      }

      return this.n5;
   }

   public final void n5(u0a var1) {
      this.n5 = var1;
      this.a6 = true;
   }

   @Override
   public final void n5(Object var1) {
      try {
         this.k5.l6();
         this.k5.n5();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public final void n5(Object var1, c7 var2) {
      try {
         this.k5.l6();
         this.k5.n5(this.l6(var2.n5));
      } finally {
         this.k5.k5();
      }
   }
}
