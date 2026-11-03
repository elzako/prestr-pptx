package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;

final class d5f extends j1 {
   private long a6;
   private t5w u9;
   private Dictionary<Long, t2s> h0 = new Dictionary<>();
   private SortedList<Long, d5f$n5> c8 = new SortedList<>();
   private com.aspose.slides.ms.System.o0[] t2;
   private List<Hyperlink> s7 = new List<>();
   private com.aspose.slides.internal.n2d.z1<Long, v5s> x8 = new com.aspose.slides.internal.n2d.z1<>(Long.class, v5s.class);
   private final Dictionary<com.aspose.slides.internal.k0r.x6s, Audio> n3 = new Dictionary<>();
   private w1c y4;
   private Dictionary<ISlide, com.aspose.slides.internal.k0r.u6p> e2 = new Dictionary<>();
   private Dictionary<Integer, s3f> t9 = new Dictionary<>();
   private List<Long> z1 = new List<>();
   private t2s t4;
   private IGenericList<IFontData> q0;
   int n5 = 0;
   int l6 = 0;
   int k5 = 0;
   boolean u3 = false;
   private byte[] z3;

   d5f(com.aspose.slides.internal.k0r.e3 var1, Presentation var2, InterruptionToken var3) {
      super(var1, var2, var3);
      this.u9 = new t5w(this.n5(), var3);
   }

   final t5w t9() {
      return this.u9;
   }

   final w1c z1() {
      return this.y4;
   }

   final void n5(w1c var1) {
      this.y4 = var1;
   }

   public final com.aspose.slides.ms.System.o0[] t4() {
      return this.t2;
   }

   public final void n5(com.aspose.slides.ms.System.o0[] var1) {
      this.t2 = var1;
   }

   public final List<Hyperlink> q0() {
      return this.s7;
   }

   public final com.aspose.slides.internal.n2d.z1<Long, v5s> z3() {
      return this.x8;
   }

   final IAudio n5(com.aspose.slides.internal.k0r.x6s var1) {
      Audio var2 = null;
      Audio[] var3 = new Audio[]{var2};
      boolean var4 = !this.n3.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         var2 = (Audio)this.n5().getAudios().addAudio(var1.u9().l6());
         if (var1.l6() != null) {
            String var5 = var1.l6().l6();
            if (!com.aspose.slides.ms.System.d1.n5(var5) && com.aspose.slides.internal.n2d.t4.k5(var5)) {
               var2.n5().n5(var5);
            }
         }

         this.n3.addItem(var1, var2);
      }

      return var2;
   }

   final void n5(t2s var1) {
      if (var1 != null) {
         this.t4 = var1;
         this.t4.k5(true);
      }
   }

   public final void l6(t2s var1) {
      if (var1.t2() != null) {
         long var2 = var1.t2().u3();
         if (this.h0.containsKey(var2)) {
            this.h0.set_Item(var2, var1);
         } else {
            this.h0.addItem(var2, var1);
         }
      }
   }

   public final Dictionary<Long, t2s> m1() {
      return this.h0;
   }

   final void n5(long var1, int var3, t2s var4) {
      d5f$n5 var5;
      if (this.c8.containsKey(var1)) {
         var5 = this.c8.get_Item(var1);
      } else {
         var5 = new d5f$n5();
         this.c8.addItem(var1, var5);
      }

      if (!var5.n5().containsKey(var3)) {
         var5.n5().addItem(var3, var4);
      }
   }

   final SortedList<Long, d5f$n5> k7() {
      return this.c8;
   }

   public final Dictionary<Integer, s3f> m3() {
      return this.t9;
   }

   public final IBaseSlide n5(long var1) {
      t2s var3 = null;
      t2s[] var4 = new t2s[]{var3};
      this.h0.tryGetValue(var1, var4);
      var3 = var4[0];
      return var3 != null ? var3.y4() : null;
   }

   final void n5(String var1, int var2) {
      if (this.n5().a6() != null && this.n5().a6().getWarningCallback() != null) {
         com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1, var2);
         var3.sendWarning(this.n5().a6().getWarningCallback());
      }
   }

   final boolean z8() {
      return false;
   }

   final boolean j5() {
      return true;
   }

   final t2s w1() {
      return this.t4;
   }

   final long r4() {
      return this.a6;
   }

   final void l6(long var1) {
      this.a6 = var1;
   }

   final byte[] c4() {
      return this.z3;
   }

   final void n5(byte[] var1) {
      this.z3 = var1;
   }

   final long y2() {
      long var1 = this.r4();
      this.l6(var1 + 1L);
      return var1;
   }

   final void n5(String var1) {
   }

   final IGenericList<IFontData> y1() {
      if (this.q0 == null) {
         this.q0 = new List<>();
         v6v var1 = this.n5().z1().n5();
         int var2 = var1.k5();

         for (int var3 = 0; var3 < var2; var3++) {
            this.q0.addItem(var1.l6(var3).l6());
         }
      }

      return this.q0;
   }
}
