package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class f8$n5 extends com.aspose.slides.internal.v6g.h0<f8$n5> {
   private Object n5;

   public final int n5() {
      if (this.n5 == null) {
         return 0;
      }

      ArrayList var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, ArrayList.class);
      return var1 != null ? var1.size() : 1;
   }

   public final Object n5(int var1) {
      if (this.n5 == null) {
         throw new ArgumentOutOfRangeException("index");
      } else {
         ArrayList var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5, ArrayList.class);
         if (var2 != null) {
            return var2.get_Item(var1);
         } else if (var1 != 0) {
            throw new ArgumentOutOfRangeException("index");
         } else {
            return this.n5;
         }
      }
   }

   public final void n5(Object var1) {
      if (this.n5 == null) {
         if (var1 == null) {
            ArrayList var4 = new ArrayList();
            var4.addItem(null);
            this.n5 = var4;
         } else {
            this.n5 = var1;
         }
      } else {
         ArrayList var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5, ArrayList.class);
         if (var2 != null) {
            var2.addItem(var1);
         } else {
            var2 = new ArrayList();
            var2.addItem(this.n5);
            var2.addItem(var1);
            this.n5 = var2;
         }
      }
   }

   public final void l6(int var1) {
      if (this.n5 == null) {
         throw new ArgumentOutOfRangeException("index");
      }

      ArrayList var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5, ArrayList.class);
      if (var2 != null) {
         var2.removeAt(var1);
      } else {
         if (var1 != 0) {
            throw new ArgumentOutOfRangeException("index");
         }

         this.n5 = null;
      }
   }

   public final void n5(int var1, Object var2) {
      if (this.n5 == null) {
         if (var1 != 0) {
            throw new ArgumentOutOfRangeException("index");
         }

         this.n5(var2);
      } else {
         ArrayList var3 = com.aspose.slides.internal.v6g.k5.n5(this.n5, ArrayList.class);
         if (var3 != null) {
            var3.insertItem(var1, var2);
         } else {
            if (var1 == 0) {
               var3 = new ArrayList();
               var3.addItem(var2);
               var3.addItem(this.n5);
               this.n5 = var3;
            } else {
               if (var1 != 1) {
                  throw new ArgumentOutOfRangeException("index");
               }

               var3 = new ArrayList();
               var3.addItem(this.n5);
               var3.addItem(var2);
               this.n5 = var3;
            }
         }
      }
   }

   public final IEnumerator l6() {
      if (this.n5 == null) {
         return XmlDocument.EmptyEnumerator;
      }

      ArrayList var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, ArrayList.class);
      return var1 != null ? var1.iterator() : new f8$n5$n5(this.n5);
   }

   public void n5(f8$n5 var1) {
      var1 = var1 == null ? new f8$n5() : var1;
      var1.n5 = this.n5;
   }

   public f8$n5 k5() {
      f8$n5 var1 = new f8$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(f8$n5 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof f8$n5) ? false : this.l6((f8$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public f8$n5 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(f8$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
