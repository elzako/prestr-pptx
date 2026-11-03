package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class m7 implements IGenericCloneable<m7> {
   private double n5;
   private double l6;
   private int k5 = 9;
   private double u3;
   private p8 a6;
   private p8 u9;
   private p6 h0;
   private p6 c8;

   public double n5() {
      return this.n5;
   }

   public void n5(double var1) {
      if (var1 < 0.0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.n5 = var1;
   }

   public double l6() {
      return this.l6;
   }

   public void l6(double var1) {
      if (var1 < 0.0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public int k5() {
      return this.k5;
   }

   public void n5(int var1) {
      this.k5 = var1;
   }

   public double u3() {
      return this.u3;
   }

   public void k5(double var1) {
      this.u3 = var1;
   }

   public p8 a6() {
      return this.a6;
   }

   public void n5(p8 var1) {
      if (this.a6 != var1) {
         this.a6 = null != var1 ? var1.n5() : null;
      }
   }

   public p8 u9() {
      return this.u9;
   }

   public void l6(p8 var1) {
      if (this.u9 != var1) {
         this.u9 = null != var1 ? var1.n5() : null;
      }
   }

   public p6 h0() {
      return this.h0;
   }

   public void n5(p6 var1) {
      if (this.h0 != var1) {
         this.h0 = null != var1 ? var1.n5() : null;
      }
   }

   public p6 c8() {
      return this.c8;
   }

   public void l6(p6 var1) {
      if (this.c8 != var1) {
         this.c8 = null != var1 ? var1.n5() : null;
      }
   }

   public m7() {
   }

   public m7 t2() {
      return new m7(this);
   }

   private m7(m7 var1) {
      this.n5(var1.n5());
      this.l6(var1.l6());
      this.n5(var1.k5());
      this.k5(var1.u3());
      this.n5(var1.a6());
      this.l6(var1.u9());
      this.n5(var1.h0());
      this.l6(var1.c8());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public m7 cloneT() {
      return this.t2();
   }

}
