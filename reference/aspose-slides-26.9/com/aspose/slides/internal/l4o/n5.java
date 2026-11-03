package com.aspose.slides.internal.l4o;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.j3b.u3;
import com.aspose.slides.ms.System.q1;

public class n5 {
   private int n5 = 0;
   private byte l6;
   private int k5;
   private boolean u3;
   private long a6;
   private double u9;
   private byte h0;
   private u3 c8;
   private int t2 = 0;
   private double s7;
   private long x8;
   private boolean n3;
   private boolean y4;
   private int e2;
   private int t9;

   public n5() {
   }

   public n5(com.aspose.slides.internal.d7u.n5 var1) {
      this.l6(var1.k5());
      this.t9 = var1.u9();
      this.l6(var1.l6() != null);
      if (var1.l6() != null) {
         this.s7 = var1.l6().l6();
         this.u9 = var1.l6().n5();
      }

      this.h0 = com.aspose.slides.internal.v6g.k5.n5((Object)(var1.u3() ? 1 : 0), (int)(9));
      this.c8 = var1.n5();
      this.e2 = var1.a6();
      this.n5(var1.h0());
   }

   public int n5() {
      return this.n5;
   }

   public void n5(int var1) {
      this.n5 = var1;
   }

   public byte l6() {
      return this.l6;
   }

   public void n5(byte var1) {
      this.l6 = var1;
   }

   public int k5() {
      return this.k5;
   }

   public void l6(int var1) {
      this.k5 = var1;
   }

   public int u3() {
      switch (this.k5()) {
         case 0:
            return 1;
         case 1:
         case 5:
         default:
            throw new ArgumentOutOfRangeException();
         case 2:
            return 3;
         case 3:
            return 1;
         case 4:
            return 2;
         case 6:
            return 4;
      }
   }

   public boolean a6() {
      return this.u3;
   }

   public void n5(boolean var1) {
      this.u3 = var1;
   }

   public long u9() {
      return this.a6;
   }

   public void n5(long var1) {
      this.a6 = var1;
   }

   public double h0() {
      return this.u9;
   }

   public byte c8() {
      return this.h0;
   }

   public u3 t2() {
      return this.c8;
   }

   public int s7() {
      return this.t9;
   }

   public int x8() {
      return this.t2;
   }

   public void k5(int var1) {
      this.t2 = var1;
   }

   public double n3() {
      return this.s7;
   }

   public long y4() {
      return this.x8;
   }

   public void l6(long var1) {
      this.x8 = var1;
   }

   public boolean e2() {
      return this.n3;
   }

   public void l6(boolean var1) {
      this.n3 = var1;
   }

   public boolean t9() {
      return this.y4;
   }

   public void k5(boolean var1) {
      this.y4 = var1;
   }

   public int z1() {
      return this.e2;
   }

   public int u3(int var1) {
      return com.aspose.slides.internal.v6g.k5.u3(q1.l6(com.aspose.slides.internal.v6g.k5.u3(this.l6(), 6) * this.u3() * var1 / 8.0), 14);
   }

   public int t4() {
      return com.aspose.slides.internal.v6g.k5.u3(this.l6(), 6) * this.u3() >> 3;
   }
}
