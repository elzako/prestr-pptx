package com.aspose.slides.internal.t6q;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class l6 implements n5 {
   protected String n5;
   private final List<String> l6;

   public l6(int var1, String[] var2) {
      this.n5 = k5.n5(var1);
      this.l6 = var2 == null ? new List<>() : new List<>(com.aspose.slides.ms.System.u3.n5(var2));
   }

   public l6(int var1) {
      this(var1, null);
   }

   public final void n5(String var1) {
      this.l6.addItem(var1);
   }

   @Override
   public final String n5() {
      a5 var1 = new a5("<");
      var1.n5(this.n5);
      var1.n5('>');
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.n5("<{0}>",new Object[]{ "rdf:li"});
            var1.n5(com.aspose.slides.internal.c5i.l6.n5(var3, false));
            var1.n5("</{0}>",new Object[]{ "rdf:li"});
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      var1.n5("</");
      var1.n5(this.n5);
      var1.n5('>');
      return var1.toString();
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5(d1.n5(new String[]{"type: ", this.n5, "|"}));
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            var1.n5(" {0}",new Object[]{ var3});
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }
}
