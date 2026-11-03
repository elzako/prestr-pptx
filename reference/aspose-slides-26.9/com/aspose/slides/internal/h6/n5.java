package com.aspose.slides.internal.h6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.internal.f5.c4;
import com.aspose.slides.internal.f5.e2;
import com.aspose.slides.internal.f5.k7;
import com.aspose.slides.internal.f5.z1;
import com.aspose.slides.internal.f5.z3;
import com.aspose.slides.internal.r7c.c8;
import com.aspose.slides.internal.r7c.u3;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.y8;

public class n5 extends z3 {
   private static final l6 l6 = new l6("en-US");

   public n5(e2 var1, z1 var2) {
      super(var1, var2);
   }

   public final String m3() {
      return this.t2("id", d1.n5);
   }

   public final void s7(String var1) {
      this.n5("id", var1);
   }

   public final String z8() {
      return this.t2("title", d1.n5);
   }

   public final void x8(String var1) {
      this.n5("title", var1);
   }

   public final String r4() {
      return this.t2("lang", d1.n5);
   }

   public final void n3(String var1) {
      this.n5("lang", var1);
   }

   public final String h2() {
      return this.t2("dir", d1.n5);
   }

   public final void y4(String var1) {
      this.n5("dir", var1);
   }

   public final String v0() {
      return this.t2("class", d1.n5);
   }

   public final void e2(String var1) {
      this.n5("class", var1);
   }

   public final String f0() {
      return this.t2("style", d1.n5);
   }

   public final void m1(String var1) {
      this.n5("style", var1);
   }

   protected final <T> T n5(String var1, T var2, Class<T> var3) {
      String var4 = this.u3(var1);
      return (T)(var4 != null ? this.l6(var4, (T)var2, var3) : var2);
   }

   protected final <T> T n5(String var1, T var2, Class<T> var3, String var4) {
      String var5 = this.u3(var1);
      if (var5 != null) {
         c8 var6 = new c8(var4);
         u3 var7 = var6.l6(var5);
         if (var7.u3()) {
            return this.l6(var7.k5(), (T)var2, var3);
         }
      }

      return (T)var2;
   }

   private <T> T l6(String var1, T var2, Class<T> var3) {
      try {
         int var4 = y8.u3(com.aspose.slides.internal.v6g.k5.n5(var3));
         return (T)com.aspose.slides.ms.System.z3.n5(var1, var4, l6);
      } catch (RuntimeException var5) {
         return (T)var2;
      }
   }

   protected final void n5(String var1, int var2) {
      this.n5(var1, a3.l6(var2));
   }

   protected final void n5(String var1, float var2) {
      this.n5(var1, n1.u9(var2));
   }

   protected final void l6(String var1, boolean var2) {
      this.n5(var1, var2 ? "true" : "false");
   }

   protected final String t2(String var1, String var2) {
      com.aspose.slides.internal.j3.k5 var3 = this.u9().l6(var1);
      if (var3 != null) {
         String var4 = var3.k5();
         if (var4 != null) {
            return var4;
         }
      }

      return var2;
   }

   protected final c4 n5(IGenericEnumerable<String> var1) {
      return k7.n5(this, var1);
   }

   protected final c4 k7(String var1) {
      return k7.n5(this, var1);
   }
}
