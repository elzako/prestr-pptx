package com.aspose.slides.internal.g4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.o5;

public class x8 {
   private final List<x8$k5> n5;
   private o5<w1> l6 = new o5<>();
   private com.aspose.slides.internal.x4g.s7 k5;
   private o5<y1> u3 = new o5<>();
   private com.aspose.slides.internal.o9b.c8 a6 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.o9b.c8 u9 = new com.aspose.slides.internal.o9b.c8();
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private float s7;
   private int x8;
   private int n3;
   private int y4;
   private float e2;
   private float[] t9;
   private float z1;
   private int t4;
   private int q0;
   private int z3;
   private t2 m1;
   private n3 k7;
   private com.aspose.slides.internal.l9.u3 m3;
   private m1 z8;
   private com.aspose.slides.internal.t8.a6 j5;

   public final com.aspose.slides.internal.x4g.s7 n5() {
      if (this.k5.h0() == 0 && this.n5.size() != 0) {
         List$Enumerator var1 = this.n5.iterator();

         try {
            while (var1.hasNext()) {
               x8$k5 var2 = (x8$k5)var1.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var2, x8$u3.class)) {
                  x8$u3 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, x8$u3.class);
                  this.k5.n5(new w1(var3.n5().l6(), var3.n5().k5()), new w1(var3.l6().l6(), var3.l6().k5()));
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var2, x8$n5.class)) {
                  x8$n5 var7 = com.aspose.slides.internal.v6g.k5.n5(var2, x8$n5.class);
                  this.k5.n5(var7.n5().u3(), var7.l6().u3(), var7.k5().u3(), var7.u3().u3());
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var2, x8$a6.class)) {
                  this.k5.t9();
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var2, x8$l6.class)) {
                  this.k5.n3();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }

      return this.k5;
   }

   public final com.aspose.slides.internal.o9b.c8 l6() {
      return this.a6.o8();
   }

   private void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.a6 = var1.o8();
   }

   public final com.aspose.slides.internal.o9b.c8 k5() {
      return this.u9.o8();
   }

   private void l6(com.aspose.slides.internal.o9b.c8 var1) {
      this.u9 = var1.o8();
   }

   public final boolean u3() {
      return this.h0;
   }

   private void l6(boolean var1) {
      this.h0 = var1;
   }

   public final boolean a6() {
      return this.c8;
   }

   public final void n5(boolean var1) {
      this.c8 = var1;
   }

   public final boolean u9() {
      return this.t2;
   }

   private void k5(boolean var1) {
      this.t2 = var1;
   }

   public final float h0() {
      return this.s7;
   }

   private void n5(float var1) {
      this.s7 = var1;
   }

   public final int c8() {
      return this.x8;
   }

   private void l6(int var1) {
      this.x8 = var1;
   }

   public final int t2() {
      return this.n3;
   }

   private void k5(int var1) {
      this.n3 = var1;
   }

   public final int s7() {
      return this.y4;
   }

   private void u3(int var1) {
      this.y4 = var1;
   }

   public final float x8() {
      return this.e2;
   }

   private void l6(float var1) {
      this.e2 = var1;
   }

   public final float[] n3() {
      return this.t9;
   }

   private void n5(float[] var1) {
      this.t9 = var1;
   }

   public final float y4() {
      return this.z1;
   }

   private void k5(float var1) {
      this.z1 = var1;
   }

   public final int e2() {
      return this.t4;
   }

   private void a6(int var1) {
      this.t4 = var1;
   }

   public final int t9() {
      return this.q0;
   }

   private void u9(int var1) {
      this.q0 = var1;
   }

   public final void n5(int var1) {
      this.z3 = var1;
   }

   public final t2 z1() {
      return this.m1;
   }

   private void n5(t2 var1) {
      this.m1 = var1;
   }

   public final n3 t4() {
      return this.k7;
   }

   private void n5(n3 var1) {
      this.k7 = var1;
   }

   public final com.aspose.slides.internal.l9.u3 q0() {
      return this.m3;
   }

   private void n5(com.aspose.slides.internal.l9.u3 var1) {
      this.m3 = var1;
   }

   public final m1 z3() {
      return this.z8;
   }

   private void l6(m1 var1) {
      this.z8 = var1;
   }

   private void n5(com.aspose.slides.internal.t8.a6 var1) {
      this.j5 = var1;
   }

   public x8(w1 var1, int var2) {
      this.n5(-1);
      this.u9(var2);
      this.n5 = new List<>();
      this.k5 = new com.aspose.slides.internal.x4g.s7();
      this.n5(var1.u3());
   }

   public x8(w1 var1, float var2, float var3, int var4, float var5) {
      this.n5(-1);
      this.u9(var4);
      this.n5 = new List<>();
      this.k5 = new com.aspose.slides.internal.x4g.s7();
      this.n5(var1.u3(), var2, var3, var5);
   }

   public final void n5(w1 var1) {
      this.n5(var1.l6(), var1.k5());
   }

   public final void l6(w1 var1) {
      this.l6(var1.l6(), var1.k5());
   }

   public final void n5(com.aspose.slides.internal.x4g.s7 var1) {
      if (this.k5 != null) {
         this.k5.dispose();
      }

      this.k5 = var1;
      this.m3();
   }

   private void m3() {
      this.u3 = new o5<>();
   }

   public final void n5(w1 var1, float var2, float var3, float var4) {
      float var5 = var1.l6();
      float var6 = var1.k5();
      float var7 = var2 - var1.l6();
      float var8 = var3 - var1.k5();
      this.n5(var5, var6);
      this.l6(var5 + var7, var6);
      this.l6(var5 + var7, var6 + var8);
      this.l6(var5, var6 + var8);
      this.m1();
   }

   public final void n5(float var1, float var2) {
      this.l6 = new o5<>(new w1(var1, var2));
      this.n5.addItem(new x8$a6(this.l6.n5().u3()));
   }

   public final void l6(float var1, float var2) {
      if (this.l6.l6()) {
         w1 var3 = new w1(var1, var2);
         this.n5.addItem(new x8$u3(this.l6.n5().u3(), var3.u3()));
         this.l6 = new o5<>(var3.u3());
      } else {
         throw new ArgumentNullException("LineTo(): m_currentPosition is null");
      }
   }

   public final void m1() {
      this.n5.addItem(new x8$l6());
   }

   public final void n5(
      com.aspose.slides.internal.o9b.c8 var1, int var2, t2 var3, n3 var4, com.aspose.slides.internal.l9.u3 var5, m1 var6, com.aspose.slides.internal.t8.a6 var7
   ) {
      this.l6(var1.o8());
      this.n5().n5(var2);
      this.l6(true);
      this.n5(var3);
      this.n5(var4);
      this.n5(var5);
      this.l6(var6);
      this.n5(var7);
   }

   public final void n5(
      com.aspose.slides.internal.o9b.c8 var1,
      float var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float[] var7,
      m1 var8,
      com.aspose.slides.internal.t8.a6 var9
   ) {
      this.n5(var1.o8());
      this.k5(true);
      this.n5(var2);
      this.l6(var3);
      this.u3(var4);
      this.k5(this.c8() == 0 ? 0 : (this.c8() == 2 ? 2 : 3));
      this.a6(com.aspose.slides.internal.g4.c8.n5(var7));
      this.l6(var5);
      this.n5(var7);
      this.k5(var6);
      this.l6(var8);
      this.n5(var9);
   }

   public final void k7() {
      this.m1();
   }

   public final void n5(w1 var1, w1 var2, w1 var3) {
      if (this.l6.l6()) {
         this.n5.addItem(new x8$n5(this.l6.n5().u3(), var1.u3(), var2.u3(), var3.u3()));
         this.l6 = new o5<>(var3.u3());
      } else {
         throw new ArgumentNullException("BezierCurveTo(): m_currentPosition is null");
      }
   }

   public final void n5(m1 var1) {
      this.k5.l6(var1);
      if (this.t4() != null) {
         this.t4().n5(var1);
      }

      if (this.z1() != null) {
         this.z1().n5(var1);
      }
   }
}
