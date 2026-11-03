package com.aspose.slides.internal.e6s;

import com.aspose.slides.internal.z0k.m3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.internal.z0k.w1;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.p5;

public class u9 {
   private final String n5;
   private final Object l6;
   private final u9$n5 k5;

   private u9(String var1, Object var2, u9$n5 var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   private static c7 k5(Object var0, String var1) {
      return new p5(var1, new w1((String)var0));
   }

   public u9(t4 var1, String var2) {
      this(var2, var1, new u9$2());
   }

   public u9(t4 var1) {
      this(var1, ".");
   }

   private static c7 u3(Object var0, String var1) {
      return new p5(var1, new m3((t4)var0));
   }

   public final c7 n5() {
      return this.k5.n5(this.l6, this.n5);
   }

   @Override
   public boolean equals(Object other) {
      u9 var2 = com.aspose.slides.internal.v6g.k5.n5(other, u9.class);
      return var2 != null ? this.l6.equals(var2.l6) : false;
   }

   @Override
   public int hashCode() {
      return this.l6.hashCode();
   }

   // $VF: synthetic method
   static c7 n5(Object var0, String var1) {
      return k5(var0, var1);
   }

   // $VF: synthetic method
   static c7 l6(Object var0, String var1) {
      return u3(var0, var1);
   }
}
