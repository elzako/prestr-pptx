package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.p3.o5;
import com.aspose.slides.ms.System.IDisposable;

public class q0 {
   private Dictionary<String, List<o5>> n5 = new Dictionary<>();
   private Dictionary<String, List<m1>> l6 = new Dictionary<>();
   private List<String> k5 = new List<>();
   private List<String> u3 = new List<>();

   public final void n5(String var1, o5 var2) {
      List var3 = null;
      List[] var4 = new List[]{var3};
      boolean var5 = !this.n5.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         var3 = new List();
         this.n5.addItem(var1, var3);
         var3.addItem(var2);
         var2.l6(var1);
         if (!this.k5.containsItem(var1)) {
            this.n5(var1, var3);
         }
      } else if (!var3.containsItem(var2)) {
         var3.addItem(var2);
      }
   }

   public final void n5(String var1) {
      this.k5.addItem(var1);
   }

   public final void l6(String var1) {
      this.u3.addItem(var1);
      if (this.k5.containsItem(var1)) {
         this.k5.removeItem(var1);
         List var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5.get_Item(var1), List.class);
         List var3 = com.aspose.slides.internal.v6g.k5.n5(this.l6.get_Item(var1), List.class);
         if (var3 != null) {
            List$Enumerator var4 = var3.iterator();

            try {
               while (var4.hasNext()) {
                  m1 var5 = (m1)var4.next();
                  var5.n5(var1, var2);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }

            this.l6.removeItemByKey(var1);
         }
      }
   }

   public final boolean k5(String var1) {
      return this.u3.containsItem(var1);
   }

   private void n5(String var1, List<o5> var2) {
      List var3 = null;
      List[] var4 = new List[]{var3};
      boolean var5 = this.l6.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         List$Enumerator var6 = var3.iterator();

         try {
            while (var6.hasNext()) {
               m1 var7 = (m1)var6.next();
               if (this.k5.containsItem(var1)) {
                  return;
               }

               var7.n5(var1, var2);
               this.u3.addItem(var1);
               this.l6.removeItemByKey(var1);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }
   }

   public final void n5(o5 var1) {
      String[] var2 = var1.u3();
      if (var2 != null) {
         for (String var6 : var2) {
            List var7 = null;
            List[] var8 = new List[]{var7};
            boolean var9 = this.n5.tryGetValue(var6, var8) && var8[0].size() != 0;
            var7 = var8[0];
            if (var9) {
               this.n5(var6, var7);
            }
         }
      }
   }

   public final List<o5> u3(String var1) {
      if (this.n5 != null && this.n5.size() != 0) {
         List var2 = null;
         List[] var3 = new List[]{var2};
         boolean var4 = this.n5.tryGetValue(var1, var3);
         var2 = var3[0];
         if (var4) {
            return var2;
         }
      }

      return new List<>();
   }

   public final void n5(String var1, m1 var2) {
      List var3 = null;
      List[] var4 = new List[]{var3};
      boolean var5 = !this.l6.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         var3 = new List();
         this.l6.addItem(var1, var3);
      }

      var3.addItem(var2);
   }
}
