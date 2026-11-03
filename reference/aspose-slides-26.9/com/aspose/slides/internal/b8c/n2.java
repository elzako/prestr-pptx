package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class n2 {
   private int n5 = 0;
   private Hashtable l6;
   private Hashtable k5 = null;
   private ArrayList u3;
   private Object a6 = null;
   private boolean u9 = true;

   public n2() {
      this.l6 = new Hashtable();
      this.u3 = new ArrayList();
   }

   public final int n5() {
      return this.n5 + 1;
   }

   public final boolean l6() {
      return this.u9;
   }

   public final void n5(boolean var1) {
      this.u9 = var1;
   }

   public final int n5(com.aspose.slides.ms.System.Xml.k6 var1, Object var2) {
      Object var3 = this.l6.get_Item(var1);
      if (var3 != null) {
         int var4 = com.aspose.slides.internal.v6g.k5.u3(var3, int.class);
         if (this.u3.get_Item(var4) != var2) {
            this.u9 = false;
         }

         return var4;
      } else {
         this.l6.addItem(var1, this.n5);
         this.u3.addItem(var2);
         return this.n5++;
      }
   }

   public final void n5(i4 var1, Object var2, boolean var3) {
      switch (var1.l6()) {
         case 0:
            this.a6 = var2;
            break;
         case 1:
            this.n5(var1.k5(), null);
            if (!var3) {
               this.n5(com.aspose.slides.ms.System.d1.n5, null);
            }
            break;
         case 2:
            IEnumerator var4 = var1.u3().iterator();

            try {
               while (var4.hasNext()) {
                  String var5 = (String)var4.next();
                  this.n5(var5, var2);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  ((IDisposable)var4).dispose();
               }
            }
      }
   }

   private void n5(String var1, Object var2) {
      if (this.k5 == null) {
         this.k5 = new Hashtable();
      }

      Object var3 = this.k5.get_Item(var1);
      if (var3 == null) {
         this.k5.addItem(var1, this.n5);
         this.u3.addItem(var2);
         this.n5++;
      } else if (var2 != null) {
         this.u3.set_Item(com.aspose.slides.internal.v6g.k5.u3(var3, int.class), var2);
      }
   }

   public final ICollection n5(i4 var1) {
      ArrayList var2 = new ArrayList();
      IEnumerator var3 = this.l6.getKeys().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.ms.System.Xml.k6 var4 = (com.aspose.slides.ms.System.Xml.k6)var3.next();
            if (com.aspose.slides.ms.System.Xml.k6.l6(var4, com.aspose.slides.ms.System.Xml.k6.n5) && var1.n5(var4)) {
               var2.addItem(this.l6.get_Item(var4));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }

      if (this.k5 != null) {
         IEnumerator var13 = this.k5.getKeys().iterator();

         try {
            while (var13.hasNext()) {
               String var5 = (String)var13.next();
               if (var1.n5(var5)) {
                  var2.addItem(this.k5.get_Item(var5));
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               ((IDisposable)var13).dispose();
            }
         }
      }

      if (var1.l6() == 0 || var1.l6() == 1) {
         var2.addItem(this.n5);
      }

      return var2;
   }

   public final int n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      Object var2 = this.l6.get_Item(var1);
      if (var2 != null) {
         return com.aspose.slides.internal.v6g.k5.u3(var2, int.class);
      }

      if (this.k5 != null) {
         var2 = this.k5.get_Item(var1.n5());
         if (var2 != null) {
            return com.aspose.slides.internal.v6g.k5.u3(var2, int.class);
         }
      }

      return this.n5;
   }

   public final boolean l6(com.aspose.slides.ms.System.Xml.k6 var1) {
      Object var2 = this.l6.get_Item(var1);
      return var2 != null;
   }

   public final Object n5(int var1) {
      return var1 == this.n5 ? this.a6 : this.u3.get_Item(var1);
   }

   public final String l6(int var1) {
      IDictionaryEnumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            DictionaryEntry var3 = (DictionaryEntry)var2.next();
            if (com.aspose.slides.internal.v6g.k5.u3(var3.getValue(), int.class) == var1) {
               return ((com.aspose.slides.ms.System.Xml.k6)var3.getKey()).toString();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }

      if (this.k5 != null) {
         IDictionaryEnumerator var13 = this.k5.iterator();

         try {
            while (var13.hasNext()) {
               DictionaryEntry var4 = (DictionaryEntry)var13.next();
               if (com.aspose.slides.internal.v6g.k5.u3(var4.getValue(), int.class) == var1) {
                  return com.aspose.slides.ms.System.d1.n5(new String[]{(String)var4.getKey(), ":*"});
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               ((IDisposable)var13).dispose();
            }
         }
      }

      return "##other:*";
   }
}
