package com.aspose.slides.internal.k1;

import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.t5n.l6$n5;
import com.aspose.slides.ms.System.d1;

public class s7 extends com.aspose.slides.internal.y6.u3 {
   private short n5;
   private short l6;
   private short k5;
   private short u3;
   private short a6;
   private byte u9;
   private byte h0;
   private byte c8;
   private byte t2;
   private byte s7;
   private byte x8;
   private byte n3;
   private byte y4;
   private byte[] e2;
   private String t9;
   private static final String[] z1 = new String[]{"Wingdings", "Webdings", "Wingdings 2", "Wingdings 3", "Symbol", "Marlett", "MT Extra"};

   public final short n5() {
      return this.n5;
   }

   public final void n5(short var1) {
      this.n5 = var1;
   }

   public final short l6() {
      return this.l6;
   }

   public final void l6(short var1) {
      this.l6 = var1;
   }

   public final short k5() {
      return this.k5;
   }

   public final void k5(short var1) {
      this.k5 = var1;
   }

   public final short u3() {
      return this.u3;
   }

   public final void u3(short var1) {
      this.u3 = var1;
   }

   public final short u9() {
      return this.a6;
   }

   public final void a6(short var1) {
      this.a6 = var1;
   }

   public final byte h0() {
      return this.u9;
   }

   public final void n5(byte var1) {
      this.u9 = var1;
   }

   public final byte c8() {
      return this.h0;
   }

   public final void l6(byte var1) {
      this.h0 = var1;
   }

   public final byte t2() {
      return this.c8;
   }

   public final void k5(byte var1) {
      this.c8 = var1;
   }

   public final byte s7() {
      return this.t2;
   }

   public final void u3(byte var1) {
      this.t2 = var1;
   }

   public final byte x8() {
      return this.s7;
   }

   public final void a6(byte var1) {
      this.s7 = var1;
   }

   public final byte n3() {
      return this.x8;
   }

   public final void u9(byte var1) {
      this.x8 = var1;
   }

   public final byte y4() {
      return this.n3;
   }

   public final void h0(byte var1) {
      this.n3 = var1;
   }

   public final byte e2() {
      return this.y4;
   }

   public final void c8(byte var1) {
      this.y4 = var1;
   }

   public final String t9() {
      return this.t9;
   }

   public final void n5(String var1) {
      this.t9 = var1;
   }

   public final byte[] z1() {
      return this.e2;
   }

   public final void n5(byte[] var1) {
      this.e2 = var1;
   }

   private static String l6(String var0) {
      for (String var4 : z1) {
         if (d1.u3(var4, var0, (short)3)) {
            return com.aspose.slides.internal.o9b.y4.k5().a6();
         }
      }

      return var0;
   }

   public final com.aspose.slides.internal.o9b.n3 n5(boolean var1) {
      String var2 = this.t9();
      if (this.s7() != 2) {
         var2 = l6(var2);
      }

      return this.k5(var2);
   }

   public final com.aspose.slides.internal.o9b.n3 t4() {
      return this.k5(this.t9());
   }

   public final i1 q0() {
      l6$n5 var1 = n5(this.t9(), this);
      return com.aspose.slides.internal.b0.l6.n5(var1);
   }

   private com.aspose.slides.internal.o9b.n3 k5(String var1) {
      l6$n5 var2 = n5(var1, this);
      return com.aspose.slides.internal.b0.l6.l6(var2);
   }

   private static l6$n5 n5(String var0, s7 var1) {
      l6$n5 var2 = new l6$n5();
      var2.n5 = var1.n5();
      var2.l6 = var1.l6();
      var2.k5 = var1.k5();
      var2.u3 = var1.u3();
      var2.a6 = var1.u9();
      var2.u9 = var1.h0();
      var2.h0 = var1.c8();
      var2.c8 = var1.t2();
      var2.t2 = var1.s7();
      var2.s7 = var1.x8();
      var2.x8 = var1.n3();
      var2.n3 = var1.y4();
      var2.y4 = var1.e2();
      var2.e2 = var0;
      return var2;
   }
}
