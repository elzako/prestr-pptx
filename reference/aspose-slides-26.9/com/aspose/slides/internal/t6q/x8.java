package com.aspose.slides.internal.t6q;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public final class x8 extends u3 implements n5 {
   public x8() {
      this.l6("xmlns:rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
   }

   public final void l6(String var1, String var2) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("prefix", "Prefix is not provided");
      }

      if (d1.n5(var2)) {
         throw new ArgumentNullException("prefix", "Prefix is not provided");
      }

      String var3 = com.aspose.slides.internal.c5i.l6.n5(var1);
      super.n5(var3, var2);
   }

   public final String l6(String var1) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("prefix", "Prefix is not provided");
      }

      String var2 = com.aspose.slides.internal.c5i.l6.n5(var1);
      return super.n5(var2);
   }

   @Override
   public final String n5() {
      a5 var1 = new a5();
      var1.n5('\n');
      var1.n5("<{0}",new Object[]{ "rdf:RDF"});
      Dictionary$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var1.n5(" xmlns:{0}=\"{1}\"",new Object[]{ var3.getKey(), var3.getValue()});
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      var1.n5(" >");
      var1.n5('\n');
      var1.l6("{0}");
      var1.n5("</{0}>",new Object[]{ "rdf:RDF"});
      return var1.toString();
   }
}
