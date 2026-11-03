package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.Xml.k6;

public class j8 {
   private ArrayList n5 = new ArrayList();
   private Hashtable l6;
   private Hashtable k5 = new Hashtable();
   private Hashtable u3;
   private int a6;
   private Hashtable u9;
   private ArrayList h0;
   private boolean c8;
   private Hashtable t2 = new Hashtable();
   private v3 s7;

   public final boolean n5() {
      return this.c8;
   }

   public final ArrayList l6() {
      return this.n5;
   }

   public final Hashtable k5() {
      return this.u3;
   }

   public final void n5(z1 var1, String var2, double var3, boolean var5) {
      if (this.u9 != null) {
         if (this.u9.contains(var2)) {
            j8$n5 var6 = (j8$n5)this.u9.get_Item(var2);
            var6.n5(var5);
            return;
         }
      } else {
         this.u9 = new Hashtable();
         this.h0 = new ArrayList();
      }

      int var7 = var1.e2(var2);
      j8$n5 var8 = new j8$n5(var7, var3, var5);
      this.u9.set_Item(var2, var8);
      this.h0.addItem(var8);
   }

   public final void u3() {
      if (this.u9 != null) {
         for (int var1 = 0; var1 < this.h0.size(); var1++) {
            for (int var2 = this.h0.size() - 1; var2 > var1; var2--) {
               j8$n5 var3 = (j8$n5)this.h0.get_Item(var2 - 1);
               j8$n5 var4 = (j8$n5)this.h0.get_Item(var2);
               if (var4.n5() < var3.n5()) {
                  this.h0.set_Item(var2 - 1, var4);
                  this.h0.set_Item(var2, var3);
               }
            }
         }

         this.c8 = true;
      }

      if (this.n5 != null) {
         for (int var5 = this.n5.size() - 1; var5 >= 0; var5--) {
            j8 var6 = (j8)this.n5.get_Item(var5);
            if (var6.n5()) {
               var6.u3();
               this.c8 = true;
            }
         }
      }
   }

   public final boolean n5(p3 var1, com.aspose.slides.internal.x6s.a6 var2) {
      if (this.h0 != null) {
         for (int var3 = this.h0.size() - 1; 0 <= var3; var3--) {
            j8$n5 var4 = (j8$n5)this.h0.get_Item(var3);
            if (var1.n5(var2, var4.l6())) {
               return var4.k5();
            }
         }
      }

      if (this.n5 != null) {
         for (int var5 = this.n5.size() - 1; var5 >= 0; var5--) {
            j8 var6 = (j8)this.n5.get_Item(var5);
            if (!var6.n5(var1, var2)) {
               return false;
            }
         }
      }

      return true;
   }

   public final void n5(u9 var1) {
      if (this.u3 == null) {
         this.u3 = new Hashtable();
      }

      if (!this.u3.containsKey(var1.n5())) {
         this.u3.set_Item(var1.n5(), var1);
      } else {
         ((u9)this.u3.get_Item(var1.n5())).n5(var1);
      }
   }

   public final void n5(w2 var1) {
      k6 var2 = var1.u3();
      if (var1.l6() != null) {
         if (this.k5.containsKey(var1.l6())) {
            throw XsltException.create("'{0}' is a duplicate template name.", var1.l6().toString());
         }

         this.k5.set_Item(var1.l6(), var1);
      }

      if (var1.n5() != -1) {
         if (this.l6 == null) {
            this.l6 = new Hashtable();
         }

         if (var2 == null) {
            var2 = k6.n5;
         }

         v3 var3 = (v3)this.l6.get_Item(var2);
         if (var3 == null) {
            var3 = new v3(this, var2);
            this.l6.set_Item(var2, var3);
            if (var2.k5()) {
               this.s7 = var3;
            }
         }

         var1.l6(++this.a6);
         var3.n5(var1);
      }
   }

   public final void a6() {
      if (this.l6 != null) {
         IDictionaryEnumerator var1 = this.l6.iterator();

         while (var1.hasNext()) {
            v3 var2 = (v3)var1.getValue();
            var2.n5();
         }
      }

      if (this.n5 != null) {
         for (int var3 = this.n5.size() - 1; var3 >= 0; var3--) {
            j8 var4 = (j8)this.n5.get_Item(var3);
            var4.a6();
         }
      }
   }

   public final void n5(z1 var1) {
      if (this.l6 != null) {
         IDictionaryEnumerator var2 = this.l6.iterator();

         while (var2.hasNext()) {
            v3 var3 = (v3)var2.getValue();
            if (var3.n5 != null) {
               for (int var4 = 0; var4 < var3.n5.size(); var4++) {
                  w2 var5 = (w2)var3.n5.get_Item(var4);
                  var5.n5(var1);
               }
            }
         }
      }

      if (this.k5 != null) {
         IDictionaryEnumerator var6 = this.k5.iterator();

         while (var6.hasNext()) {
            w2 var8 = (w2)var6.getValue();
            var8.n5(var1);
         }
      }

      if (this.n5 != null) {
         for (int var7 = this.n5.size() - 1; var7 >= 0; var7--) {
            j8 var9 = (j8)this.n5.get_Item(var7);
            var9.n5(var1);
         }
      }
   }

   public final w2 n5(p3 var1, com.aspose.slides.internal.x6s.a6 var2, k6 var3) {
      w2 var4 = null;
      if (this.l6 != null) {
         v3 var5 = (v3)this.l6.get_Item(var3);
         if (var5 != null) {
            var4 = var5.n5(var1, var2);
         }
      }

      if (var4 == null) {
         var4 = this.l6(var1, var2, var3);
      }

      return var4;
   }

   public final w2 l6(p3 var1, com.aspose.slides.internal.x6s.a6 var2, k6 var3) {
      w2 var4 = null;
      if (this.n5 != null) {
         for (int var5 = this.n5.size() - 1; var5 >= 0; var5--) {
            j8 var6 = (j8)this.n5.get_Item(var5);
            var4 = var6.n5(var1, var2, var3);
            if (var4 != null) {
               return var4;
            }
         }
      }

      return var4;
   }

   public final w2 l6(p3 var1, com.aspose.slides.internal.x6s.a6 var2) {
      w2 var3 = null;
      if (this.s7 != null) {
         var3 = this.s7.n5(var1, var2);
      }

      if (var3 == null) {
         var3 = this.k5(var1, var2);
      }

      return var3;
   }

   public final w2 n5(k6 var1) {
      w2 var2 = null;
      if (this.k5 != null) {
         var2 = (w2)this.k5.get_Item(var1);
      }

      if (var2 == null && this.n5 != null) {
         for (int var3 = this.n5.size() - 1; var3 >= 0; var3--) {
            j8 var4 = (j8)this.n5.get_Item(var3);
            var2 = var4.n5(var1);
            if (var2 != null) {
               return var2;
            }
         }
      }

      return var2;
   }

   public final w2 k5(p3 var1, com.aspose.slides.internal.x6s.a6 var2) {
      w2 var3 = null;
      if (this.n5 != null) {
         for (int var4 = this.n5.size() - 1; var4 >= 0; var4--) {
            j8 var5 = (j8)this.n5.get_Item(var4);
            var3 = var5.l6(var1, var2);
            if (var3 != null) {
               return var3;
            }
         }
      }

      return var3;
   }

   public final Hashtable u9() {
      return this.t2;
   }
}
