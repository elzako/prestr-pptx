package com.aspose.slides.internal.x8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class a5 extends u3 {
   private IGenericList<String> n5;

   public a5(IGenericList<String> var1) {
      super("lang(");
      this.n5 = var1;
   }

   @Override
   public String a6() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      if (this.n5.size() != 0) {
         var1.n5(this.n5.get_Item(0));

         for (int var2 = 1; var2 < this.n5.size(); var2++) {
            var1.n5(", ").n5(this.n5.get_Item(var2));
         }
      }

      return d1.n5(':', this.n5(), var1.toString(), ')');
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      String var3;
      if (var1.t2("lang")) {
         var3 = var1.u3("lang");
      } else {
         var3 = ((com.aspose.slides.internal.k5.m1)var1.c4()).n5().l6().l6();
      }

      if (d1.n5(var3)) {
         return false;
      }

      IGenericEnumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            String var5 = (String)var4.next();
            if (this.n5(var3, var5)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return false;
   }

   private boolean n5(String var1, String var2) {
      if (var1.length() < var2.length()) {
         return false;
      } else if (var1.length() == var2.length()) {
         return d1.u3(var1, var2, (short)5);
      } else {
         return !d1.n5(var1, var2, (short)5) ? false : var1.charAt(var2.length()) == '-';
      }
   }
}
