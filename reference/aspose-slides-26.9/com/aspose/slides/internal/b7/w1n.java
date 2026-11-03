package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class w1n implements IGenericCloneable<w1n> {
   private g6 n5;
   private n9 l6;
   private n9 k5;
   private u2 u3;
   private s1o a6;
   private u7f u9;
   private r6i h0;
   private r6i c8;
   private r6i t2;
   private r6i s7;
   private int x8 = 0;
   private String n3;
   private String y4;
   private boolean e2;
   private boolean t9;
   private int z1 = 0;
   private int t4 = 0;
   private double q0 = 100.0;
   private int z3 = 0;
   private double m1;
   private boolean k7;
   private boolean m3;
   private double z8;
   private double j5;

   public g6 n5() {
      return this.n5;
   }

   public void n5(g6 var1) {
      if (this.n5 != var1) {
         this.n5 = var1 != null ? var1.a6() : null;
      }
   }

   public n9 l6() {
      return this.l6;
   }

   public void n5(n9 var1) {
      if (this.l6 != var1) {
         this.l6 = var1 != null ? var1.n5() : null;
      }
   }

   public void l6(n9 var1) {
      if (this.k5 != var1) {
         this.k5 = var1 != null ? var1.n5() : null;
      }
   }

   public void n5(u2 var1) {
      if (this.u3 != var1) {
         this.u3 = null != var1 ? var1.n5() : null;
      }
   }

   public void n5(s1o var1) {
      if (var1 != this.a6) {
         this.a6 = null != var1 ? var1.n5() : null;
      }
   }

   public void n5(u7f var1) {
      if (var1 != this.u9) {
         this.u9 = var1 != null ? var1.n5() : null;
      }
   }

   public r6i k5() {
      return this.h0;
   }

   public void n5(r6i var1) {
      if (var1 != this.h0) {
         this.h0 = null != var1 ? var1.a6() : null;
      }
   }

   public void l6(r6i var1) {
      if (var1 != this.c8) {
         this.c8 = null != var1 ? var1.a6() : null;
      }
   }

   public void k5(r6i var1) {
      if (var1 != this.t2) {
         this.t2 = null != var1 ? var1.a6() : null;
      }
   }

   public void u3(r6i var1) {
      if (var1 != this.s7) {
         this.s7 = var1 != null ? var1.a6() : null;
      }
   }

   public void n5(int var1) {
      this.x8 = var1;
   }

   public void n5(String var1) {
      this.n3 = var1;
   }

   public void l6(String var1) {
      this.y4 = var1;
   }

   public boolean u3() {
      return this.e2;
   }

   public void n5(boolean var1) {
      this.e2 = var1;
   }

   public boolean a6() {
      return this.t9;
   }

   public void l6(boolean var1) {
      this.t9 = var1;
   }

   public void l6(int var1) {
      this.z1 = var1;
   }

   public void k5(int var1) {
      this.t4 = var1;
   }

   public void n5(double var1) {
      if (var1 <= 0.0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.q0 = var1;
   }

   public void u3(int var1) {
      this.z3 = var1;
   }

   public void l6(double var1) {
      if (var1 < 0.0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.m1 = var1;
   }

   public void k5(boolean var1) {
      this.k7 = var1;
   }

   public void u3(boolean var1) {
      this.m3 = var1;
   }

   public double u9() {
      return this.z8;
   }

   public void k5(double var1) {
      this.z8 = var1;
   }

   public double h0() {
      return this.j5;
   }

   public void u3(double var1) {
      if (var1 < 0.0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.j5 = var1;
   }

   public w1n() {
   }

   public w1n c8() {
      return new w1n(this);
   }

   private w1n(w1n var1) {
      this.n5(var1.n5);
      this.n5(var1.l6);
      this.l6(var1.k5);
      this.n5(var1.u3);
      this.n5(var1.a6);
      this.n5(var1.u9);
      this.n5(var1.h0);
      this.l6(var1.c8);
      this.k5(var1.t2);
      this.u3(var1.s7);
      this.n5(var1.x8);
      this.n5(var1.n3);
      this.l6(var1.y4);
      this.n5(var1.e2);
      this.l6(var1.t9);
      this.l6(var1.z1);
      this.k5(var1.t4);
      this.n5(var1.q0);
      this.u3(var1.z3);
      this.l6(var1.m1);
      this.k5(var1.k7);
      this.u3(var1.m3);
      this.k5(var1.z8);
      this.u3(var1.j5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w1n cloneT() {
      return this.c8();
   }

}
