package com.aspose.slides.internal.b8c;

public class j2 implements u4 {
   private boolean n5;
   private boolean l6;
   private v1 k5;
   private l2 u3;
   private j9e a6;
   private u1s u9;
   private int h0;
   private int c8;

   public j2() {
      this.s7();
   }

   public j2(int var1) {
      this();
      this.h0 = var1;
   }

   @Override
   public final int ak_() {
      return this.h0;
   }

   public final void n5(int var1) {
      this.h0 = var1;
   }

   @Override
   public final boolean l6() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public final boolean aj_() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }

   @Override
   public final u1s al_() {
      return this.u9;
   }

   public final void n5(u1s var1) {
      this.u9 = var1;
   }

   @Override
   public final j9e am_() {
      return this.a6;
   }

   public final void n5(j9e var1) {
      this.a6 = var1;
      if (this.a6 != null) {
         this.c8 = this.a6.v4();
      } else {
         this.c8 = 1;
      }
   }

   @Override
   public final v1 an_() {
      return this.k5;
   }

   public final void n5(v1 var1) {
      this.k5 = var1;
      if (var1 != null) {
         this.u3 = null;
      }
   }

   @Override
   public final l2 ao_() {
      return this.u3;
   }

   public final void n5(l2 var1) {
      this.u3 = var1;
      if (var1 != null) {
         this.k5 = null;
      }
   }

   public final j9e c8() {
      return this.u9 != null ? this.u9 : this.a6;
   }

   public final boolean t2() {
      return this.a6 != null && this.a6.b3() != null ? this.a6.b3().x8() == 2 : false;
   }

   public final void s7() {
      this.l6 = false;
      this.n5 = false;
      this.a6 = null;
      this.k5 = null;
      this.u3 = null;
      this.u9 = null;
      this.h0 = 0;
      this.c8 = 1;
   }
}
