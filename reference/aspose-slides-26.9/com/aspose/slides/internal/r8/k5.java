package com.aspose.slides.internal.r8;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.j3.z8;

public class k5 implements com.aspose.slides.internal.d1.k5 {
   private IGenericList<String> n5;
   private IGenericList<KeyValuePair<String, String>> l6;
   private boolean k5;
   private boolean u3;

   protected k5() {
   }

   public static k5 n5(IGenericEnumerable<String> var0, String var1) {
      return n5(new k5(), var0, var1);
   }

   public static k5 n5(String var0, String var1) {
      List var2 = new List();
      var2.addItem(var0);
      return n5(var2, var1);
   }

   public static k5 l6(IGenericEnumerable<KeyValuePair<String, String>> var0, String var1) {
      return l6(new k5(), var0, var1);
   }

   public static k5 n5(String var0, String var1, String var2) {
      List var3 = new List();
      var3.addItem(new KeyValuePair<>(var0, var1));
      return l6(var3, var2);
   }

   protected static k5 n5(k5 var0, IGenericEnumerable<String> var1, String var2) {
      var0.n5 = new List<>(var1);
      var0.l6 = null;
      var0.k5 = var0.n5.containsItem(var2);
      return var0;
   }

   protected static k5 l6(k5 var0, IGenericEnumerable<KeyValuePair<String, String>> var1, String var2) {
      var0.n5 = null;
      var0.l6 = new List<>(var1);
      var0.u3 = var0.l6.containsItem(new KeyValuePair<>(var2, var2));
      return var0;
   }

   @Override
   public short n5(z8 var1) {
      if (this.n5 != null) {
         if (this.k5 || this.n5.containsItem(var1.h0())) {
            return 1;
         }
      } else {
         KeyValuePair var2 = new KeyValuePair<>(var1.s7(), var1.t2());
         if (this.u3 || this.l6.containsItem(var2.Clone())) {
            return 1;
         }
      }

      return 3;
   }
}
