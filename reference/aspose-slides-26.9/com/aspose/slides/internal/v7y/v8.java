package com.aspose.slides.internal.v7y;

import com.aspose.slides.exceptions.InvalidOperationException;

public final class v8 extends j9 {
   public j9 n5;
   public j9 l6;
   private boolean u3;
   private boolean a6;
   private com.aspose.slides.internal.x6s.a6 u9;
   private com.aspose.slides.internal.x6s.a6 h0;

   public v8(j9 var1, j9 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = true;
      this.a6 = true;
   }

   private v8(v8 var1) {
      super(var1);
      this.n5 = n5(var1.n5);
      this.l6 = n5(var1.l6);
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = k5(var1.u9);
      this.h0 = k5(var1.h0);
   }

   @Override
   public void t2() {
      this.n5.t2();
      this.l6.t2();
      this.u3 = true;
      this.a6 = true;
      this.h0 = null;
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      this.n5.n5(var1);
      this.l6.n5(var1);
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      this.n5.n5(var1);
      this.l6.n5(var1);
      this.u3 = true;
      this.a6 = true;
      this.h0 = null;
      super.x8();
      return this;
   }

   private com.aspose.slides.internal.x6s.a6 l6(com.aspose.slides.internal.x6s.a6 var1) {
      this.u9 = var1;
      this.u3 = this.a6 = true;
      return var1;
   }

   private com.aspose.slides.internal.x6s.a6 l6(com.aspose.slides.internal.x6s.a6 var1, com.aspose.slides.internal.x6s.a6 var2) {
      this.h0 = var2;
      this.a6 = false;
      this.u3 = true;
      this.u9 = var1;
      return var1;
   }

   private com.aspose.slides.internal.x6s.a6 k5(com.aspose.slides.internal.x6s.a6 var1, com.aspose.slides.internal.x6s.a6 var2) {
      this.h0 = var1;
      this.u3 = false;
      this.a6 = true;
      this.u9 = var2;
      return var2;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      int var1 = 0;
      com.aspose.slides.internal.x6s.a6 var2;
      if (this.u3) {
         var2 = this.n5.h0();
      } else {
         var2 = this.h0;
      }

      com.aspose.slides.internal.x6s.a6 var3;
      if (this.a6) {
         var3 = this.l6.h0();
      } else {
         var3 = this.h0;
      }

      if (var2 != null && var3 != null) {
         var1 = n5(var2, var3);
         if (var1 == 0) {
            return this.l6(var2, var3);
         } else {
            return var1 == 1 ? this.k5(var2, var3) : this.l6(var2);
         }
      } else if (var3 == null) {
         this.u3 = true;
         this.a6 = false;
         this.u9 = var2;
         this.h0 = null;
         return var2;
      } else {
         this.u3 = false;
         this.a6 = true;
         this.u9 = var3;
         this.h0 = null;
         return var3;
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 n5(com.aspose.slides.internal.x6s.a6 var1) {
      if (var1 != null) {
         com.aspose.slides.internal.x6s.a6 var2 = this.n5.n5(var1);
         return var2 != null ? var2 : this.l6.n5(var1);
      } else {
         return null;
      }
   }

   @Override
   public int u9() {
      return 3;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new v8(this);
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      return this.u9;
   }

   @Override
   public int u3() {
      throw new InvalidOperationException();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
