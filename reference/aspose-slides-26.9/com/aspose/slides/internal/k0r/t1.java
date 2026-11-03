package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

public class t1 extends r4 implements m4 {
   private u6 n5;
   private a5 l6;
   private v0 k5;
   private j2p u3;
   private i8 a6;
   private i8 u9;
   private j2p h0;
   private c5 c8;
   private e5 t2;
   private long s7 = 255L;
   private long n3;
   private static final int[] y4 = new int[]{
      1001,
      Integer.MAX_VALUE,
      1033,
      Integer.MAX_VALUE,
      1010,
      Integer.MAX_VALUE,
      2020,
      Integer.MAX_VALUE,
      1035,
      Integer.MAX_VALUE,
      4080,
      1,
      2000,
      Integer.MAX_VALUE,
      4057,
      3,
      4057,
      4,
      4080,
      0,
      4080,
      2,
      1025,
      Integer.MAX_VALUE,
      1040,
      Integer.MAX_VALUE,
      1026,
      Integer.MAX_VALUE,
      1030,
      Integer.MAX_VALUE,
      6000,
      Integer.MAX_VALUE
   };

   public t1() {
      this.w1().n5(1000);
   }

   final void l6() {
      u6 var1 = new u6();
      this.e2().addItem(var1);
      var1.n5(new com.aspose.slides.internal.o9b.p8(5760, 4320));
      var1.l6(new com.aspose.slides.internal.o9b.p8(4320, 5760));
      var1.k5(new com.aspose.slides.internal.o9b.p8(5, 10));
      var1.n5(0L);
      var1.l6(0L);
      var1.n5(1);
      var1.l6(0);
      var1.n5(false);
      var1.l6(false);
      var1.k5(false);
      var1.u3(true);
      c7 var2 = new c7();
      this.t2().e2().addItem(var2);
      r9 var3 = new r9();
      var2.e2().addItem(var3);
      var3.n5(1);
      z6 var4 = new z6();
      this.e2().addItem(var4);
   }

   final w1n n5(k2 var1, long var2) {
      if (var1 == null) {
         throw new ArgumentNullException("master");
      }

      j2p var4 = this.t9();
      if (var4 == null) {
         var4 = new j2p();
         var4.w1().n5((short)1);
         this.n5(var4);
         this.u3 = var4;
      }

      w1n var5 = new w1n(null);
      var4.l6().n5(var5);
      var5.n5(var1.c8());
      var5.l6(false);
      var5.l6(var2);
      var1.l6(var5.u3());
      if (this.n3()) {
         var1.l6(true);
      }

      return var5;
   }

   final w1n n5(u6p var1, long var2) {
      if (var1 == null) {
         throw new ArgumentNullException("slide");
      }

      j2p var4 = this.t9();
      if (var4 == null) {
         var4 = new j2p();
         var4.w1().n5((short)1);
         this.n5(var4);
         this.u3 = var4;
      }

      w1n var5 = new w1n(null);
      var4.l6().n5(var5);
      var5.n5(var1.c8());
      var5.l6(true);
      var5.l6(var2);
      var1.l6(var5.u3());
      if (this.n3()) {
         var1.l6(true);
      }

      return var5;
   }

   final w1n l6(u6p var1, long var2) {
      if (var1 == null) {
         throw new ArgumentNullException("slide");
      }

      j2p var4 = this.z3();
      if (var4 == null) {
         var4 = new j2p();
         this.n5(var4);
         this.h0 = var4;
      }

      w1n var5 = new w1n(null);
      var4.l6().n5(var5);
      var5.n5(var1.c8());
      var5.l6(true);
      var5.n5(0);
      var5.l6(var2);
      var1.l6(var5.u3());
      if (this.n3()) {
         var1.l6(true);
      }

      return var5;
   }

   final w1n n5(o4 var1) {
      j2p var2 = this.m1();
      if (var2 == null) {
         var2 = new j2p();
         var2.w1().n5((short)2);
         this.n5(var2);
      }

      w1n var3 = new w1n(null);
      var2.l6().n5(var3);
      var3.n5(var1.c8());
      var3.l6(this.u3());
      return var3;
   }

   final long u3() {
      return ++this.s7;
   }

   public final u6 a6() {
      if (this.n5 != null) {
         return this.n5;
      }

      this.n5 = (u6)this.k5(1001);
      return this.n5;
   }

   public final c5 u9() {
      if (this.c8 != null) {
         return this.c8;
      }

      this.c8 = (c5)this.k5(1033);
      return this.c8;
   }

   public final c5 h0() {
      if (this.c8 != null) {
         return this.c8;
      }

      this.c8 = (c5)this.k5(1033);
      if (this.c8 == null) {
         this.c8 = new c5();
         this.c8.e2().addItem(new d9());
         this.n5(this.c8);
      }

      return this.c8;
   }

   public final a5 t2() {
      if (this.l6 != null) {
         return this.l6;
      }

      this.l6 = (a5)this.k5(1010);
      if (this.l6 == null && this.n3()) {
         this.l6 = new a5();
         this.n5(this.l6);
      }

      return this.l6;
   }

   public final d0p s7() {
      return (d0p)this.k5(2020);
   }

   public final v0 x8() {
      if (this.k5 != null) {
         return this.k5;
      }

      this.k5 = (v0)this.k5(1035);
      if (this.k5 == null && this.n3()) {
         this.k5 = new v0();
         this.k5.l6(true);
         this.n5(this.k5);
      }

      return this.k5;
   }

   public final j2p t9() {
      if (this.u3 != null) {
         return this.u3;
      }

      this.u3 = (j2p)this.n5(4080, (short)1);
      return this.u3;
   }

   public final e5 z1() {
      if (this.t2 != null) {
         return this.t2;
      }

      this.t2 = (e5)this.k5(2000);
      if (this.t2 == null && this.n3()) {
         this.t2 = new e5();
         this.t2.l6(true);
         this.n5(this.t2);
      }

      return this.t2;
   }

   public final i8 t4() {
      if (this.a6 != null) {
         return this.a6;
      }

      this.a6 = (i8)this.n5(4057, (short)3);
      if (this.a6 == null && this.n3()) {
         this.a6 = new i8();
         this.a6.w1().n5((short)3);
         this.a6.l6(true);
         this.n5(this.a6);
      }

      return this.a6;
   }

   public final i8 q0() {
      if (this.u9 != null) {
         return this.u9;
      }

      this.u9 = (i8)this.n5(4057, (short)4);
      if (this.u9 == null && this.n3()) {
         this.u9 = new i8();
         this.u9.w1().n5((short)4);
         this.u9.l6(true);
         this.n5(this.u9);
      }

      return this.u9;
   }

   public final j2p z3() {
      if (this.h0 != null) {
         return this.h0;
      }

      this.h0 = (j2p)this.n5(4080, (short)0);
      return this.h0;
   }

   public final j2p m1() {
      return (j2p)this.n5(4080, (short)2);
   }

   public final t5g k7() {
      return (t5g)this.k5(1026);
   }

   public final z7 m3() {
      return (z7)this.k5(1030);
   }

   public final x4 z8() {
      return (x4)this.k5(6000);
   }

   public final r3q j5() {
      return (r3q)this.k5(1064);
   }

   public final List<r5w> l6(long var1) {
      for (int var3 = 0; var3 < 3; var3++) {
         j2p var4 = null;
         switch (var3) {
            case 0:
               var4 = this.t9();
               break;
            case 1:
               var4 = this.z3();
               break;
            case 2:
               var4 = this.m1();
         }

         if (var4 != null) {
            List var5 = var4.l6().n5(var1);
            if (var5 != null) {
               return var5;
            }
         }
      }

      return null;
   }

   @Override
   public final long c8() {
      return this.n3;
   }

   @Override
   public final void n5(long var1) {
      this.n3 = var1;
   }

   @Override
   protected int[] k5() {
      return y4;
   }
}
