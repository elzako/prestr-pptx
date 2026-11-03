package com.aspose.slides.internal.o1;

import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.v6g.c8;
import com.aspose.slides.ms.System.o5;

public class u3 {
   private static final c8<u3> l6 = new c8<>(null);
   private final p8 k5 = new p8(1600, 900);
   private final com.aspose.slides.internal.o9b.c8 u3;
   private final p8 a6;
   private o5<Integer> u9;
   private o5<Integer> h0;
   private o5<Integer> c8;
   private o5<Integer> t2;
   private o5<Integer> s7;
   private o5<Integer> x8;
   private o5<Integer> n3;
   public f2 n5;

   private u3() {
      this.u3 = com.aspose.slides.internal.o9b.c8.u3.o8();
      this.a6 = p8.n5.u3();
      this.u9 = new o5<>();
      this.h0 = new o5<>();
      this.c8 = new o5<>();
      this.t2 = new o5<>();
      this.s7 = new o5<>();
      this.x8 = new o5<>();
      this.n3 = new o5<>();
      this.n5 = new f2(1.0F, 1.0F);
      this.k5.k5(this.a6);
   }

   public final f2 n5() {
      return this.n5;
   }

   public final void n5(f2 var1) {
      var1.l6(this.n5);
   }

   public u3(com.aspose.slides.internal.o9b.c8 var1) {
      this();
      var1.n5(this.u3);
   }

   public u3(p8 var1) {
      this.u3 = com.aspose.slides.internal.o9b.c8.u3.o8();
      this.a6 = p8.n5.u3();
      this.u9 = new o5<>();
      this.h0 = new o5<>();
      this.c8 = new o5<>();
      this.t2 = new o5<>();
      this.s7 = new o5<>();
      this.x8 = new o5<>();
      this.n3 = new o5<>();
      this.n5 = new f2(1.0F, 1.0F);
      var1.k5(this.a6);
   }

   public u3(com.aspose.slides.internal.o9b.c8 var1, p8 var2) {
      this(var1.o8());
      var2.k5(this.a6);
   }

   public static u3 l6() {
      u3 var0 = l6.get();
      if (var0 == null) {
         l6.set(new u3());
         var0 = l6.get();
      }

      return var0;
   }

   public final com.aspose.slides.internal.o9b.c8 k5() {
      return this.u3;
   }

   public final p8 u3() {
      return this.a6;
   }

   public final o5<Integer> a6() {
      return this.u9;
   }

   public final void n5(o5<Integer> var1) {
      var1.n5(this.u9);
   }

   public final o5<Integer> u9() {
      return this.h0;
   }

   public final void l6(o5<Integer> var1) {
      var1.n5(this.h0);
   }

   public final o5<Integer> h0() {
      return this.c8;
   }

   public final void k5(o5<Integer> var1) {
      var1.n5(this.c8);
   }

   public final o5<Integer> c8() {
      return this.t2;
   }

   public final void u3(o5<Integer> var1) {
      var1.n5(this.t2);
   }

   public final o5<Integer> t2() {
      return this.s7;
   }

   public final void a6(o5<Integer> var1) {
      var1.n5(this.s7);
   }

   public final o5<Integer> s7() {
      return this.x8;
   }

   public final void u9(o5<Integer> var1) {
      var1.n5(this.x8);
   }

   public final o5<Integer> x8() {
      return this.n3;
   }

   public final void h0(o5<Integer> var1) {
      var1.n5(this.n3);
   }
}
