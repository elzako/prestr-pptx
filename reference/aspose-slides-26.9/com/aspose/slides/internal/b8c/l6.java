package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class l6 extends z1 {
   private Hashtable a6;
   private Object[] u9;
   private s7 h0;
   private int c8 = 0;

   public l6(int var1, int var2, boolean var3) {
      super(var1, false, var3);
      this.a6 = new Hashtable(var2);
      this.u9 = new Object[var2];
      this.h0 = new s7(var2);
   }

   public final boolean n5(com.aspose.slides.ms.System.Xml.k6 var1, Object var2, boolean var3) {
      if (this.a6.get_Item(var1) != null) {
         return false;
      }

      int var4 = this.a6.size();
      this.a6.addItem(var1, var4);
      this.u9[var4] = var2;
      if (!var3) {
         this.h0.l6(var4);
         this.c8++;
      }

      return true;
   }

   @Override
   public boolean n5() {
      return super.n5() || this.c8 == 0;
   }

   @Override
   public void n5(x5 var1) {
      var1.z1 = new s7(this.a6.size());
      var1.y4.l6 = -1;
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.Xml.k6 var1, x5 var2, int[] var3) {
      Object var4 = this.a6.get_Item(var1);
      var3[0] = 0;
      if (var4 == null) {
         var2.k5 = false;
         return null;
      }

      int var5 = com.aspose.slides.internal.v6g.k5.u3(var4, int.class);
      if (var2.z1.n5(var5)) {
         var3[0] = -2;
         return null;
      }

      if (var2.y4.l6 == -1) {
         var2.y4.l6 = 0;
      }

      var2.z1.l6(var5);
      if (this.h0.n5(var5)) {
         var2.y4.l6++;
      }

      return this.u9[var5];
   }

   @Override
   public boolean l6(x5 var1) {
      return var1.y4.l6 == this.c8 || this.n5() && var1.y4.l6 == -1;
   }

   @Override
   public ArrayList n5(x5 var1, boolean var2) {
      ArrayList var3 = null;
      IDictionaryEnumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            DictionaryEntry var5 = (DictionaryEntry)var4.next();
            if (!var1.z1.n5(com.aspose.slides.internal.v6g.k5.u3(var5.getValue(), int.class))
               && (!var2 || this.h0.n5(com.aspose.slides.internal.v6g.k5.u3(var5.getValue(), int.class)))) {
               if (var3 == null) {
                  var3 = new ArrayList();
               }

               var3.addItem(var5.getKey());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            ((IDisposable)var4).dispose();
         }
      }

      return var3;
   }

   @Override
   public ArrayList n5(x5 var1, boolean var2, k0t var3) {
      ArrayList var4 = new ArrayList();
      IDictionaryEnumerator var5 = this.a6.iterator();

      try {
         while (var5.hasNext()) {
            DictionaryEntry var6 = (DictionaryEntry)var5.next();
            if (!var1.z1.n5(com.aspose.slides.internal.v6g.k5.u3(var6.getValue(), int.class))
               && (!var2 || this.h0.n5(com.aspose.slides.internal.v6g.k5.u3(var6.getValue(), int.class)))) {
               n5(com.aspose.slides.internal.v6g.k5.n5(this.u9[com.aspose.slides.internal.v6g.k5.u3(var6.getValue(), int.class)], c1.class), var3, var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }

      return var4;
   }
}
