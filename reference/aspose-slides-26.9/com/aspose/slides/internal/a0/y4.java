package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.p3.o5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class y4 extends n5 implements m1 {
   private List<y4> l6 = new List<>();
   private String k5 = null;
   private boolean u3 = true;
   private String a6;
   private o5 u9 = null;
   private Dictionary<String, List<y4>> h0 = new Dictionary<>();

   public y4(com.aspose.slides.internal.a5.k5 var1) {
      this.a6 = null;
      this.n5 = 2;
      this.u3 = true;

      for (int var2 = 0; var2 < var1.i1().size(); var2++) {
         com.aspose.slides.internal.a5.n5 var3 = var1.i1().get_Item(var2);
         this.n5(this.n5(var3));
      }
   }

   public y4(com.aspose.slides.internal.a5.n5 var1) {
      this.k5 = var1.e5();
      this.u3 = var1.o0();
      this.a6 = var1.b3();
   }

   private void n5(String var1, y4 var2) {
      List var3 = null;
      List[] var4 = new List[]{var3};
      boolean var5 = !this.h0.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         var3 = new List();
         this.h0.addItem(var1, var3);
      }

      var3.addItem(var2);
   }

   public y4() {
      this.a6 = null;
      this.n5 = 2;
      this.u3 = true;
   }

   public final String l6() {
      return this.a6;
   }

   public final void n5(y4 var1) {
      this.l6.addItem(var1);
      if (var1.u9 == null) {
         this.n5(var1.l6(), var1);
         String[] var2 = var1.u3();

         for (String var6 : var2) {
            this.n5(var6, var1);
         }
      }
   }

   @Override
   public final boolean k5() {
      return this.h0 == null || this.h0.size() == 0;
   }

   @Override
   public final String[] u3() {
      String[] var1 = new String[this.h0.getKeys().size()];
      this.h0.getKeys().copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0);
      return var1;
   }

   @Override
   public final void n5(String var1, List<o5> var2) {
      if (d1.a6(var1, this.a6)) {
         this.u9 = (o5)var2.get_Item(0);
      }

      List var3 = null;
      List[] var4 = new List[]{var3};
      boolean var5 = this.h0.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         List$Enumerator var6 = var3.iterator();

         try {
            while (var6.hasNext()) {
               m1 var7 = (m1)var6.next();
               var7.n5(var1, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      this.h0.removeItemByKey(var1);
   }

   @Override
   public String a6() {
      return "Bookmarks";
   }

   private y4 n5(com.aspose.slides.internal.a5.n5 var1) {
      y4 var2 = new y4(var1);

      for (int var3 = 0; var3 < var1.z7().size(); var3++) {
         com.aspose.slides.internal.a5.n5 var4 = var1.z7().get_Item(var3);
         var2.n5(this.n5(var4));
      }

      return var2;
   }
}
