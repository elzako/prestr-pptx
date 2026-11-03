package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p3.e9;
import com.aspose.slides.internal.p3.i9;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.v4;
import com.aspose.slides.internal.p3.z7;
import com.aspose.slides.ms.System.d1;

public class y4 extends com.aspose.slides.internal.p3.n5 implements j5 {
   private com.aspose.slides.internal.a0.l6 u3;
   private int a6;
   private com.aspose.slides.internal.p3.y2 u9;
   private j5 h0 = null;

   public y4(com.aspose.slides.internal.a0.l6 var1, com.aspose.slides.internal.p3.y2 var2) {
      this.u3 = var1;
      this.u9 = var2;
   }

   public y4(e9 var1, com.aspose.slides.internal.t1.r4 var2) {
      this.u9 = var1;
      this.u3 = new com.aspose.slides.internal.a0.k7();

      try {
         com.aspose.slides.internal.p3.y2 var3 = var1.y1().n5(var2);
         this.k5(var3);
         this.l6(var3);
      } catch (InvalidOperationException var4) {
         throw var4;
      }
   }

   @Override
   public void t4() {
   }

   private void l6(com.aspose.slides.internal.p3.y2 var1) {
      int var2 = 1000000;
      t1 var3 = new t1(2);
      var3.n5(new i9(false));
      var3.l6(new i9(false));
      var3.l6(var2);
      short var4 = 14000;
      short var5 = 12000;
      short var6 = 2000;
      int var7 = (var4 - var5 - var6) / 2;
      int var8 = var5 + var7;
      int var9 = var6 + var7;
      int var10 = var9;
      this.a6 = 0;
      List var11 = this.n5(var3, 135);
      if (var9 - var8 > var10) {
         var10 = var9 - var8;
      }

      t1 var12 = new t1(0);
      var12.n5(256, true);
      var12.n5(new i9(false));
      var12.l6(new i9(false));
      z7 var13 = new z7(var11, 0, var11.size());
      var1.n5(var13, var12);
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      int var3 = ((com.aspose.slides.internal.d2.c8)this.u3).l6();
      t1 var4 = new t1(var2);
      var4.l6(0.0);
      this.h0.n5(var1, var4);
      ((com.aspose.slides.internal.d2.c8)this.u3).l6(var3);
   }

   public final int q0() {
      return this.a6;
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      return this.u3;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      this.u3.n5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.p3.y2 var1) {
      this.u9 = var1;
   }

   @Override
   public com.aspose.slides.internal.p3.y2 h0() {
      return this.u9;
   }

   @Override
   public boolean m3() {
      return false;
   }

   public void k5(boolean var1) {
   }

   @Override
   public boolean l6(int var1) {
      return false;
   }

   @Override
   public List<com.aspose.slides.internal.p3.y2> r4() {
      List var1 = new List(1);
      var1.addItem(this.h0);
      return var1;
   }

   @Override
   public void k5(com.aspose.slides.internal.p3.y2 var1) {
      if (var1 != null) {
         var1.n5(this);
         this.h0 = (j5)var1;
      }
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      List var3 = new List();
      this.h0.t4();

      while (!this.h0.m3()) {
         List var4 = this.h0.n5(var1, var2);
         if (var4 != null) {
            while (var4.size() > 0) {
               com.aspose.slides.internal.r4.u9 var5 = (com.aspose.slides.internal.r4.u9)var4.get_Item(0);
               var4.removeAt(0);
               if (var5.u3()) {
                  v4 var6 = var5.l6();
                  com.aspose.slides.internal.r4.u3 var7 = new com.aspose.slides.internal.r4.u3<>(var6);

                  while (var7.l6()) {
                     com.aspose.slides.internal.p3.i1 var9 = (com.aspose.slides.internal.p3.i1)var7.k5();
                     this.a6 = this.a6 + var9.z1();
                     var3.addItem(var9);
                  }
               } else {
                  com.aspose.slides.internal.p3.i1 var8 = (com.aspose.slides.internal.p3.i1)var5;
                  this.a6 = this.a6 + var8.z1();
                  var3.addItem(var8);
               }
            }
         }
      }

      this.k5(true);
      return var3;
   }

   @Override
   public final List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1) {
      return var1;
   }

   @Override
   public final List<com.aspose.slides.internal.r4.u9> l6(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      return this.n5(var1);
   }

   @Override
   public final String a6(j8 var1) {
      return d1.n5;
   }

   @Override
   public final void n5(j8 var1, q0 var2) {
   }

   @Override
   public final boolean l6(List<com.aspose.slides.internal.r4.u9> var1) {
      return false;
   }

   @Override
   public final boolean k5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      return this.l6(var1);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      return null;
   }

   @Override
   public final List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2, int var3) {
      return this.n5(var1, var2);
   }

   @Override
   public e9 z8() {
      return this.u9.z8();
   }

   @Override
   public int c8() {
      return this.u3.l6();
   }

   @Override
   public int t2() {
      return this.u3.e_();
   }

   @Override
   public boolean s7() {
      return false;
   }

   @Override
   public boolean x8() {
      return this.n3() || com.aspose.slides.internal.v6g.k5.l6(this.u3, com.aspose.slides.internal.a0.t2.class);
   }

   @Override
   public boolean n3() {
      return com.aspose.slides.internal.v6g.k5.l6(this.u3, com.aspose.slides.internal.a0.k7.class);
   }

   @Override
   public j8 n5(j8 var1) {
      return var1;
   }
}
