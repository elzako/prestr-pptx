package com.aspose.slides.internal.j9e;

import com.aspose.slides.ms.System.o0;
import java.util.HashMap;

public final class s7 implements Cloneable {
   private o0 n5 = new o0();
   private String l6;
   private String k5;
   private String u3;
   private int a6;
   private String u9;
   private o0 h0 = new o0();
   private String c8;
   private byte[][] t2;
   private byte[][] s7;
   private int x8;

   public static s7[] n5() {
      HashMap var0 = com.aspose.slides.internal.t5g.n5.a6();
      s7[] var1 = new s7[var0.size()];
      int var2 = 0;

      for (Object recoveredElement$var4$563 : var0.values()) {
         s7 var4 = (s7)recoveredElement$var4$563;
         var1[var2] = new s7();
         var1[var2].n5 = var4.n5;
         var1[var2].h0 = var4.h0;
         var1[var2].l6 = var4.l6;
         var1[var2].k5 = var4.k5;
         var1[var2].a6 = var4.a6;
         var1[var2].u3 = var4.u3;
         var1[var2].u9 = var4.u9;
         var1[var2].c8 = var4.c8;
         var1[var2].t2 = var4.t2;
         var1[var2].s7 = var4.s7;
         var1[var2++].x8 = var4.x8;
      }

      return var1;
   }

   public o0 l6() {
      return this.n5;
   }

   public void n5(o0 var1) {
      var1.k5(this.n5);
   }

   public String k5() {
      return this.l6;
   }

   public void n5(String var1) {
      this.l6 = var1;
   }

   public String u3() {
      return this.u3;
   }

   public void l6(String var1) {
      this.u3 = var1;
   }

   public int a6() {
      return this.a6;
   }

   public void n5(int var1) {
      this.a6 = var1;
   }

   public void k5(String var1) {
      this.u9 = var1;
   }

   public o0 u9() {
      return this.h0;
   }

   public void l6(o0 var1) {
      var1.k5(this.h0);
   }

   public String h0() {
      return this.c8;
   }

   public void u3(String var1) {
      this.c8 = var1;
   }

   public void n5(byte[][] var1) {
      this.t2 = var1;
   }

   public void l6(byte[][] var1) {
      this.s7 = var1;
   }

   public void l6(int var1) {
      this.x8 = var1;
   }
}
