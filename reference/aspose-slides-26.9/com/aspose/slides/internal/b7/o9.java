package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class o9 implements IGenericCloneable<o9> {
   private c4t n5;
   private c4t l6;
   private c4t k5;
   private v2s u3;
   private f1c a6;
   private p6t u9;
   private u6p h0;
   private k2p c8;
   private w1n t2;
   private int s7 = 0;
   private double x8;
   private boolean n3 = true;
   private int y4 = 4;
   private boolean e2;
   private t1z t9;
   private boolean z1 = true;
   private d0p t4;
   private r5d q0;
   private r5d z3;
   private boolean m1;

   public o9() {
      this.n5(new p6w());
      this.n5(new e3m());
      this.n5(new o8m());
   }

   public void n5(c4t var1) {
      this.n5 = var1;
   }

   public void l6(c4t var1) {
      this.l6 = var1;
   }

   public c4t n5() {
      return this.k5;
   }

   public void k5(c4t var1) {
      this.k5 = var1;
   }

   public v2s l6() {
      return this.u3;
   }

   public void n5(v2s var1) {
      this.u3 = var1;
   }

   public f1c k5() {
      return this.a6;
   }

   public void n5(f1c var1) {
      this.a6 = var1;
   }

   public p6t u3() {
      return this.u9;
   }

   public void n5(p6t var1) {
      this.u9 = var1;
   }

   public u6p a6() {
      return this.h0;
   }

   public void n5(u6p var1) {
      if (this.h0 != var1) {
         this.h0 = null != var1 ? var1.n5() : null;
      }
   }

   public void n5(k2p var1) {
      this.c8 = var1;
   }

   public void n5(w1n var1) {
      this.t2 = var1;
   }

   public int u9() {
      return this.s7;
   }

   public void n5(int var1) {
      this.s7 = var1;
   }

   public void n5(double var1) {
      if (var1 < 0.0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.x8 = var1;
   }

   public void n5(boolean var1) {
      this.n3 = var1;
   }

   public void l6(int var1) {
      this.y4 = var1;
   }

   public void l6(boolean var1) {
      this.e2 = var1;
   }

   public t1z h0() {
      return this.t9;
   }

   public void n5(t1z var1) {
      this.t9 = var1;
   }

   public void k5(boolean var1) {
      this.z1 = var1;
   }

   public d0p c8() {
      return this.t4;
   }

   public void n5(d0p var1) {
      this.t4 = var1;
   }

   public r5d t2() {
      return this.q0;
   }

   public void n5(r5d var1) {
      this.q0 = var1;
   }

   public r5d s7() {
      return this.z3;
   }

   public void l6(r5d var1) {
      this.z3 = var1;
   }

   public boolean x8() {
      return this.m1;
   }

   public void u3(boolean var1) {
      this.m1 = var1;
   }

   public o9 n3() {
      return new o9(this);
   }

   private o9(o9 var1) {
      this.n5(var1.n5 != null ? var1.n5.n5() : null);
      this.l6(var1.l6 != null ? var1.l6.n5() : null);
      this.k5(var1.k5 != null ? var1.n5().n5() : null);
      this.n5(var1.u3 != null ? var1.u3.k5() : null);
      this.n5(var1.a6 != null ? var1.a6.n5() : null);
      this.n5(var1.u9 != null ? var1.u3().n5() : null);
      this.n5(var1.h0 != null ? var1.h0.n5() : null);
      this.n5(var1.c8 != null ? var1.c8.n5() : null);
      this.n5(var1.t2 != null ? var1.t2.c8() : null);
      this.n5(var1.s7);
      this.n5(var1.x8);
      this.n5(var1.n3);
      this.l6(var1.y4);
      this.l6(var1.e2);
      this.n5(var1.t9 != null ? var1.t9.l6() : null);
      this.k5(var1.z1);
      this.n5(var1.t4 != null ? var1.t4.l6() : null);
      this.n5(var1.q0 != null ? var1.q0.l6() : null);
      this.l6(var1.z3 != null ? var1.z3.l6() : null);
      this.u3(var1.m1);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public o9 cloneT() {
      return this.n3();
   }

}
