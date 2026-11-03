package com.aspose.slides.internal.h0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class u9 extends n5 implements com.aspose.slides.internal.k5.n3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private List<String> u9 = new List<>();

   public u9(q0 var1, com.aspose.slides.internal.k5.q0 var2) {
      super(var1, var2, (short)11);
   }

   @Override
   public String l6() {
      a5 var1 = new a5();
      var1.n5("{0} {1} {{",new Object[]{ "@counter-style", this.u9()});
      if (!d1.n5(this.h0())) {
         var1.n5(" type: {0};",new Object[]{ this.h0()});
      }

      if (this.n3().size() != 0) {
         var1.n5(" glyphs: {0};",new Object[]{ this.c8()});
      }

      if (!d1.n5(this.t2())) {
         var1.n5(" prefix: {0};",new Object[]{ this.t2()});
      }

      if (!d1.n5(this.s7())) {
         var1.n5(" suffix: {0};",new Object[]{ this.s7()});
      }

      if (!d1.n5(this.x8())) {
         var1.n5(" fallback: {0};",new Object[]{ this.x8()});
      }

      var1.n5("}");
      return var1.toString();
   }

   @Override
   public void l6(String var1) {
      throw new NotImplementedException();
   }

   public final String u9() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String h0() {
      return this.l6;
   }

   public final void k5(String var1) {
      this.l6 = var1;
   }

   public final String c8() {
      if (this.u9.size() == 0) {
         return d1.n5;
      }

      a5 var1 = new a5();
      List$Enumerator var2 = this.u9.iterator();
      var2.hasNext();
      var1.n5("'{0}'", var2.next());

      while (var2.hasNext()) {
         var1.n5(" '{0}'", var2.next());
      }

      return var1.toString();
   }

   public final String t2() {
      return this.k5;
   }

   public final void u3(String var1) {
      this.k5 = var1;
   }

   public final String s7() {
      return this.u3;
   }

   public final void a6(String var1) {
      this.u3 = var1;
   }

   public final String x8() {
      return this.a6;
   }

   public final void u9(String var1) {
      this.a6 = var1;
   }

   public final List<String> n3() {
      return this.u9;
   }
}
