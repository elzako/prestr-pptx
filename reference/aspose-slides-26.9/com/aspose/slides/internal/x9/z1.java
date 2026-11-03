package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z1 {
   private static z1 n5 = null;
   private boolean l6 = false;
   private com.aspose.slides.internal.p3.z8 k5 = null;
   private boolean u3 = false;
   private List<com.aspose.slides.internal.p3.z3> a6 = new List<>();
   private Dictionary<Object, List<t9>> u9 = new Dictionary<>();

   private z1() {
   }

   public final boolean n5() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public static z1 l6() {
      if (n5 == null) {
         n5 = new z1();
      }

      return n5;
   }

   public final boolean k5() {
      return this.u3;
   }

   public final void l6(boolean var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.p3.z8 u3() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.p3.z8 var1) {
      this.k5 = var1;
   }

   public final List<com.aspose.slides.internal.p3.z3> a6() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.j9.c8 var1, t9 var2) {
      if (!this.u9.containsKey(var1.y4())) {
         this.u9.set_Item(var1.y4(), new List<>());
      }

      List var3 = this.u9.get_Item(var1.y4());
      List$Enumerator var4 = var3.iterator();

      label62: {
         t9 var5;
         try {
            do {
               if (!var4.hasNext()) {
                  break label62;
               }

               var5 = (t9)var4.next();
            } while (var5.y4() != var2.y4());
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         return;
      }

      var2.a6(true);
      var3.addItem(var2);
   }

   public final int n5(com.aspose.slides.internal.j9.c8 var1, com.aspose.slides.internal.e5.t9 var2) {
      if (!this.u9.containsKey(var1.y4())) {
         return -1;
      }

      List var3 = this.u9.get_Item(var1.y4());

      for (int var4 = 0; var4 < var3.size(); var4++) {
         if (((t9)var3.get_Item(var4)).y4() == var2) {
            return var4;
         }
      }

      return -1;
   }

   public final boolean n5(com.aspose.slides.internal.j9.c8 var1, int var2) {
      List var3 = this.u9.get_Item(var1.y4());
      if (((t9)var3.get_Item(var2)).y1()) {
         var3.removeAt(var2);
         return true;
      } else {
         return false;
      }
   }

   public final List<t9> n5(com.aspose.slides.internal.j9.c8 var1) {
      return !this.u9.containsKey(var1.y4()) ? null : this.u9.get_Item(var1.y4());
   }

   public final void u9() {
      this.a6.clear();
   }

   public final void h0() {
      this.u9();
      n5 = null;
   }
}
