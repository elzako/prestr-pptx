package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public abstract class m1 extends b3 {
   public final b3 n5(String var1) {
      List$Enumerator var2 = this.t2().iterator();

      try {
         while (var2.hasNext()) {
            g7 var3 = (g7)var2.next();
            if (com.aspose.slides.ms.System.d1.a6(var3.n5(), var1)) {
               return var3.l6();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public static boolean n5(int var0, boolean var1) {
      return var0 == 0 ? var1 : var0 == 1 || var0 == 3;
   }

   public abstract String n5();

   public abstract void l6(String var1);

   public abstract String l6();

   public abstract void k5(String var1);

   public abstract String k5();

   public abstract String u3();

   public abstract void u3(String var1);

   public abstract int a6();

   public abstract void n5(int var1);

   public abstract int u9();

   public abstract void l6(int var1);

   public abstract int h0();

   public abstract void k5(int var1);

   public abstract String c8();

   public abstract void a6(String var1);

   public abstract List<g7> t2();

   public abstract g7 u9(String var1);

   public int s7() {
      return 0;
   }

   public void u3(int var1) {
   }

   public int x8() {
      return 0;
   }

   public void a6(int var1) {
   }

   public String n3() {
      return null;
   }

   public void h0(String var1) {
   }

   public String y4() {
      return null;
   }

   public void c8(String var1) {
   }

   public float e2() {
      return Float.NaN;
   }

   public void n5(float var1) {
   }

   public void u9(int var1) {
   }

   public void h0(int var1) {
   }

   public String t9() {
      return null;
   }

   public void t2(String var1) {
   }

   public String z1() {
      return null;
   }

   public void s7(String var1) {
   }

   public String t4() {
      return null;
   }

   public void x8(String var1) {
   }

   public String q0() {
      return null;
   }

   public void n3(String var1) {
   }

   public String z3() {
      return null;
   }

   public void y4(String var1) {
   }
}
