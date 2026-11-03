package com.aspose.slides.internal.b5x;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.i2i.n3;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.ms.System.e2;
import com.aspose.slides.ms.System.p8;

class u9 {
   private ArrayList n5;
   private ArrayList l6;
   private ArrayList k5;
   private ArrayList u3;
   private ArrayList a6;

   public u9() {
   }

   public u9(com.aspose.slides.internal.x8w.l6 var1) {
      for (int var2 = 0; var2 < var1.n5(); var2++) {
         switch (var1.n5(var2).l6() & 0xFF) {
            case 129:
               if (this.n5 == null) {
                  this.n5 = new ArrayList();
               }

               this.n5.addItem(j5.e2().l6(var1.n5(var2).u3()));
               break;
            case 130:
               if (this.l6 == null) {
                  this.l6 = new ArrayList();
               }

               this.l6.addItem(j5.e2().l6(var1.n5(var2).u3()));
               break;
            case 132:
            case 164:
               if (this.k5 == null) {
                  this.k5 = new ArrayList();
               }

               this.k5.addItem(n3.n5(var1.n5(var2).n5(0)));
               break;
            case 134:
               if (this.u3 == null) {
                  this.u3 = new ArrayList();
               }

               this.u3.addItem(j5.e2().l6(var1.n5(var2).u3()));
               break;
            case 135:
               if (this.a6 == null) {
                  this.a6 = new ArrayList();
               }

               byte[] var3 = var1.n5(var2).u3();
               String var4 = var3.length == 4 ? "." : ":";
               a5 var5 = new a5();
               int var6 = 0;

               for (; var6 < var3.length; var6++) {
                  var5.n5(e2.l6(var3[var6]));
                  if (var6 < var3.length - 1) {
                     var5.n5(var4);
                  }
               }

               this.a6.addItem(var5.toString());
               if (this.a6 == null) {
                  this.a6 = new ArrayList();
               }
         }
      }
   }

   public String[] n5() {
      return this.l6 == null
         ? new String[0]
         : com.aspose.slides.internal.v6g.k5.k5(this.l6.toArray(com.aspose.slides.internal.v6g.k5.n5(String.class)), String[].class);
   }

   public String[] l6() {
      return this.a6 == null
         ? new String[0]
         : com.aspose.slides.internal.v6g.k5.k5(this.a6.toArray(com.aspose.slides.internal.v6g.k5.n5(String.class)), String[].class);
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      if (this.n5 != null) {
         for (Object recoveredElement$var3$2699 : this.n5) {
            String var3 = (String)recoveredElement$var3$2699;
            var1.n5("RFC822 Name=");
            var1.n5(var3);
            var1.n5(p8.k5());
         }
      }

      if (this.l6 != null) {
         for (Object recoveredElement$var8$2881 : this.l6) {
            String var8 = (String)recoveredElement$var8$2881;
            var1.n5("DNS Name=");
            var1.n5(var8);
            var1.n5(p8.k5());
         }
      }

      if (this.k5 != null) {
         for (Object recoveredElement$var9$3060 : this.k5) {
            String var9 = (String)recoveredElement$var9$3060;
            var1.n5("Directory Address: ");
            var1.n5(var9);
            var1.n5(p8.k5());
         }
      }

      if (this.u3 != null) {
         for (Object recoveredElement$var10$3249 : this.u3) {
            String var10 = (String)recoveredElement$var10$3249;
            var1.n5("URL=");
            var1.n5(var10);
            var1.n5(p8.k5());
         }
      }

      if (this.a6 != null) {
         for (Object recoveredElement$var11$3425 : this.a6) {
            String var11 = (String)recoveredElement$var11$3425;
            var1.n5("IP Address=");
            var1.n5(var11);
            var1.n5(p8.k5());
         }
      }

      return var1.toString();
   }
}
