package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class x9 {
   private final List<f0> n5 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "ID", "Module", "Name", "HelpContextID", "CMG", "DPB", "GC"
   );

   final void n5(com.aspose.slides.internal.z0k.w1 var1) {
      KeyValuePair var2 = g7.n5(var1).Clone();
      if (!"ID".equals(var2.getKey())) {
         throw new d1();
      }

      h2 var3 = new h2(com.aspose.slides.ms.System.d1.n5((String)var2.getValue(), "\"", ""));
      this.n5.addItem(var3);

      do {
         g7.n5(var1).CloneTo(var2);
         switch (l6.n5((String)var2.getKey())) {
            case 0:
               h2 var4 = new h2((String)var2.getValue());
               this.n5.addItem(var4);
               break;
            case 1:
               j9 var5 = new j9((String)var2.getValue());
               this.n5.addItem(var5);
               break;
            case 2:
               a3 var6 = new a3((String)var2.getValue());
               this.n5.addItem(var6);
               break;
            case 3:
               a5 var7 = new a5((String)var2.getValue());
               this.n5.addItem(var7);
               break;
            case 4:
               y0 var8 = new y0((String)var2.getValue());
               this.n5.addItem(var8);
               break;
            case 5:
               p3 var9 = new p3((String)var2.getValue());
               this.n5.addItem(var9);
               break;
            case 6:
               e9 var10 = new e9((String)var2.getValue());
               this.n5.addItem(var10);
               break;
            default:
               f5 var11 = new f5((String)var2.getValue(), (String)var2.getKey());
               this.n5.addItem(var11);
         }
      } while (!this.a6((String)var2.getKey()));
   }

   final void n5(com.aspose.slides.internal.z0k.r4 var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            f0 var3 = (f0)var2.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final void n5(String var1) {
      com.aspose.slides.ms.System.o0 var2 = com.aspose.slides.ms.System.o0.l6().k5();
      h2 var3 = new h2(com.aspose.slides.ms.System.d1.t2(var2.n5("B")));
      this.n5.addItem(var3);
      a3 var4 = new a3(var1);
      this.n5.addItem(var4);
      a5 var5 = new a5("0");
      this.n5.addItem(var5);
      n3 var6 = new n3(var2.k5(), 4L, new byte[]{0, 0, 0, 0});
      y0 var7 = new y0(var6.toString());
      this.n5.addItem(var7);
      n3 var8 = new n3(var2.k5(), 1L, new byte[]{0});
      p3 var9 = new p3(var8.toString());
      this.n5.addItem(var9);
      n3 var10 = new n3(var2.k5(), 1L, new byte[]{-1});
      e9 var11 = new e9(var10.toString());
      this.n5.addItem(var11);
   }

   final void l6(String var1) {
      j9 var2 = new j9(var1);
      this.n5.insertItem(this.n5(), var2);
   }

   final void k5(String var1) {
      f0 var2 = this.n5.find(new x9$1(this, var1));
      if (var2 == null) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("Property for module with name {0} is not exists", new Object[]{var1}));
      }

      this.n5.removeItem(var2);
   }

   final f0 u3(String var1) {
      return this.n5.find(new x9$2(this, var1));
   }

   private boolean a6(String var1) {
      return "GC".equals(var1);
   }

   private int n5() {
      f0 var1 = this.n5.findLast(new x9$3(this));
      if (var1 != null) {
         int var4 = this.n5.indexOf(var1);
         return this.n5.indexOf(var1) + 1;
      }

      f0 var2 = this.n5.findLast(new x9$4(this));
      if (var2 == null) {
         throw new InvalidOperationException();
      }

      int var3 = this.n5.indexOf(var2);
      return var3 + 1;
   }
}
