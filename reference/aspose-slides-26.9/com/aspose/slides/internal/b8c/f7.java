package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class f7 extends c1 {
   private String l6;
   private int k5 = 0;
   private i4 u3;

   public final String n5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final i4 u9() {
      return this.u3;
   }

   public final String h0() {
      return this.l6 != null && this.l6.length() != 0 ? this.l6 : "##any";
   }

   public final int c8() {
      return this.k5 == 0 ? 3 : this.k5;
   }

   @Override
   public String t2() {
      switch (this.u3.l6()) {
         case 0:
            return "##any:*";
         case 1:
            return "##other:*";
         case 2:
            com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
            int var2 = 1;
            IEnumerator var3 = this.u3.u3().iterator();

            try {
               for (; var3.hasNext(); var2++) {
                  String var4 = (String)var3.next();
                  var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var4, ":*"}));
                  if (var2 < this.u3.u3().size()) {
                     var1.n5(" ");
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  ((IDisposable)var3).dispose();
               }
            }

            return var1.toString();
         default:
            return com.aspose.slides.ms.System.d1.n5;
      }
   }

   public final void k5(String var1) {
      if (this.l6 != null) {
         this.u3 = new i4(this.l6, var1);
      } else {
         this.u3 = new i4();
      }
   }

   public final void a6(String var1) {
      if (this.l6 != null) {
         this.u3 = new q2(this.l6, var1);
      } else {
         this.u3 = new i4();
      }
   }

   public final boolean n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      return this.u3.n5(var1.n5());
   }
}
