package com.aspose.slides.internal.k3w;

import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a6 implements u3, com.aspose.slides.internal.t9z.k5 {
   private final m3 l6;
   private final float k5;
   private final boolean u3;
   private final com.aspose.slides.internal.t9z.k5 a6;
   private final com.aspose.slides.internal.t9z.k5 u9;
   private final k5 h0;
   private final u9 c8;
   private final List<h0> t2;
   private final boolean s7;
   private com.aspose.slides.internal.z5p.h0 x8;
   private final com.aspose.slides.internal.z5p.k5 n3;
   private final com.aspose.slides.internal.z5p.a6 y4;
   private final com.aspose.slides.internal.z5p.u3 e2;
   // $VF: synthetic field
   static final boolean n5 = !a6.class.desiredAssertionStatus();

   public a6(
      com.aspose.slides.internal.t9z.h0 var1,
      boolean var2,
      com.aspose.slides.internal.t9z.k5 var3,
      com.aspose.slides.internal.t9z.k5 var4,
      k5 var5,
      List<com.aspose.slides.internal.x7u.u9> var6,
      List<com.aspose.slides.internal.w2k.a6> var7
   ) {
      this.l6 = var1.n5();
      this.k5 = var1.n5().q0();
      this.u3 = var2;
      this.a6 = var3;
      this.u9 = var4;
      this.h0 = var5;
      this.c8 = new u9();
      this.t2 = new ArrayList<>(var6.size());
      assert var6.size() == var7.size();

      for (int var8 = 0; var8 < var6.size(); var8++) {
         com.aspose.slides.internal.x7u.u9 var9 = (com.aspose.slides.internal.x7u.u9)var6.get(var8);
         com.aspose.slides.internal.w2k.a6 var10 = (com.aspose.slides.internal.w2k.a6)var7.get(var8);
         this.t2.add(new h0(var9, var10));
      }

      this.s7 = this.t2.size() == 1;
      if (this.s7) {
         this.c8.l6 = (com.aspose.slides.internal.x7u.u9)var6.get(0);
      } else {
         this.c8.l6 = com.aspose.slides.internal.x7u.h0.n5(var1);
      }

      this.n3 = new com.aspose.slides.internal.z5p.k5(this);
      this.y4 = new com.aspose.slides.internal.z5p.a6(this);
      this.e2 = new com.aspose.slides.internal.z5p.u3(this);
      this.x8 = this.n3;
   }

   @Override
   public void n5(float var1, float var2) {
      this.x8.n5(var1, var2);
      this.x8 = this.y4;
      this.u9.n5(var1, var2);
   }

   @Override
   public void l6(float var1, float var2) {
      this.x8.l6(var1, var2);
      this.x8 = this.e2;
      this.u9.l6(var1, var2);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.x8.n5(var1, var2, var3, var4);
      this.x8 = this.e2;
      this.u9.n5(var1, var2, var3, var4);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.x8.n5(var1, var2, var3, var4, var5, var6);
      this.x8 = this.e2;
      this.u9.n5(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void n5() {
      this.x8.n5();
      this.x8 = this.n3;
      this.u9.n5();
   }

   @Override
   public void l6() {
      this.x8.l6();
      this.x8 = this.n3;
      this.u9.l6();
   }

   public float u3() {
      return this.k5;
   }

   public boolean a6() {
      return this.s7;
   }

   public boolean u9() {
      return this.u3;
   }

   public u9 h0() {
      return this.c8;
   }

   public List<h0> c8() {
      return this.t2;
   }

   public void n5(h0 var1, w1 var2) {
      this.n5(var1.a6, var2);
   }

   public void l6(h0 var1, w1 var2) {
      this.n5(var1.u9, var2);
   }

   public void k5(h0 var1, w1 var2) {
      this.l6(var1.a6, var2);
   }

   public void u3(h0 var1, w1 var2) {
      this.l6(var1.u9, var2);
   }

   private void n5(com.aspose.slides.internal.v9l.k5 var1, w1 var2) {
      Iterator var3 = var1.u9();
      if (var3.hasNext()) {
         com.aspose.slides.internal.v9l.l6 var4 = (com.aspose.slides.internal.v9l.l6)var3.next();
         var4.n5(var2);
      }
   }

   private void l6(com.aspose.slides.internal.v9l.k5 var1, w1 var2) {
      Iterator var3 = var1.h0();
      if (var3.hasNext()) {
         ((com.aspose.slides.internal.v9l.l6)var3.next()).l6(var2);
      }
   }

   @Override
   public boolean k5() {
      return this.n5(this.t2.get(0));
   }

   public boolean n5(h0 var1) {
      return var1.a6.n5() > 0 && var1.a6.k5().l6() == 2;
   }

   public void n5(h0 var1, float var2, float var3) {
      var1.a6.l6(com.aspose.slides.internal.v9l.l6.n5(var2, var3));
   }

   @Override
   public void k5(float var1, float var2) {
      this.l6(this.t2.get(0), var1, var2);
   }

   public void l6(h0 var1, float var2, float var3) {
      var1.a6.l6(com.aspose.slides.internal.v9l.l6.l6(var2, var3));
   }

   public void k5(h0 var1, float var2, float var3) {
      var1.u9.l6(com.aspose.slides.internal.v9l.l6.l6(var2, var3));
   }

   @Override
   public void u3(float var1, float var2) {
      this.u3(this.t2.get(0), var1, var2);
   }

   public void u3(h0 var1, float var2, float var3) {
      var1.u9.n5(com.aspose.slides.internal.v9l.l6.l6(var2, var3));
   }

   public void n5(h0 var1, float var2, float var3, boolean var4) {
      if (var4) {
         this.k5(var1, var2, var3);
      } else {
         this.l6(var1, var2, var3);
      }
   }

   public void n5(h0 var1, float var2, float var3, float var4, float var5) {
      var1.a6.l6(com.aspose.slides.internal.v9l.l6.n5(var2, var3, var4, var5));
   }

   public void n5(h0 var1, float var2, float var3, float var4, float var5, boolean var6) {
      if (var6) {
         this.l6(var1, var2, var3, var4, var5);
      } else {
         this.n5(var1, var2, var3, var4, var5);
      }
   }

   public void l6(h0 var1, float var2, float var3, float var4, float var5) {
      var1.u9.l6(com.aspose.slides.internal.v9l.l6.n5(var2, var3, var4, var5));
   }

   @Override
   public void l6(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.n5(this.t2.get(0), var1, var2, var3, var4, var5, var6);
   }

   public void n5(h0 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.a6.l6(com.aspose.slides.internal.v9l.l6.n5(var2, var3, var4, var5, var6, var7));
   }

   public void l6(h0 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.u9.l6(com.aspose.slides.internal.v9l.l6.n5(var2, var3, var4, var5, var6, var7));
   }

   @Override
   public void k5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.k5(this.t2.get(0), var1, var2, var3, var4, var5, var6);
   }

   public void k5(h0 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.u9.n5(com.aspose.slides.internal.v9l.l6.n5(var2, var3, var4, var5, var6, var7));
   }

   public void n5(h0 var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8) {
      if (var8) {
         this.l6(var1, var2, var3, var4, var5, var6, var7);
      } else {
         this.n5(var1, var2, var3, var4, var5, var6, var7);
      }
   }

   public void l6(h0 var1) {
      var1.a6.l6(com.aspose.slides.internal.v9l.l6.n5());
   }

   public void t2() {
      this.a6.l6();
   }

   public void n5(boolean var1) {
      this.h0.n5(this, var1);

      for (h0 var3 : this.t2) {
         this.k5(var3);
         this.u3(var3);
         this.s7();
      }
   }

   private void k5(h0 var1) {
      com.aspose.slides.internal.t9z.u3.n5(var1.a6, this.a6);
      var1.a6.l6();
   }

   private void u3(h0 var1) {
      if (!this.u3) {
         com.aspose.slides.internal.t9z.u3.l6(var1.u9, this.a6);
      }

      var1.u9.l6();
   }

   private void s7() {
      if (!this.u3) {
         this.a6.n5();
      }
   }
}
