package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

public class s2 implements IEnumerable, a3 {
   private s2$n5[] n5;
   private int l6 = 0;
   private z9 k5;
   private int u3;
   private Dictionary<String, Integer> a6;
   private boolean u9;
   private String h0;
   private String c8;

   public s2() {
   }

   public s2(z9 var1) {
      this.k5 = var1;
      this.h0 = var1.n5("xml");
      this.c8 = var1.n5("xmlns");
      this.n5 = (s2$n5[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(s2$n5.class), 8));
      String var2 = var1.n5(com.aspose.slides.ms.System.d1.n5);
      this.n5[0].n5(var2, var2, -1, -1);
      this.n5[1].n5(this.c8, var1.n5("http://www.w3.org/2000/xmlns/"), -1, -1);
      this.n5[2].n5(this.h0, var1.n5("http://www.w3.org/XML/1998/namespace"), 0, -1);
      this.l6 = 2;
      this.u3 = 1;
   }

   public z9 n5() {
      return this.k5;
   }

   public String l6() {
      String var1 = this.n5(com.aspose.slides.ms.System.d1.n5);
      return var1 == null ? com.aspose.slides.ms.System.d1.n5 : var1;
   }

   public void k5() {
      this.u3++;
   }

   public boolean u3() {
      int var1 = this.l6;
      if (this.u3 == 1) {
         return false;
      }

      for (; this.n5[var1].k5 == this.u3; var1--) {
         if (this.u9) {
            this.a6.set_Item(this.n5[var1].n5, this.n5[var1].u3);
         }
      }

      this.l6 = var1;
      this.u3--;
      return true;
   }

   public void n5(String var1, String var2) {
      if (var2 == null) {
         throw new ArgumentNullException("uri");
      }

      if (var1 == null) {
         throw new ArgumentNullException("prefix");
      }

      var1 = this.k5.n5(var1);
      var2 = this.k5.n5(var2);
      if (v8.n5(this.h0, var1) && !com.aspose.slides.ms.System.d1.a6(var2, "http://www.w3.org/XML/1998/namespace")) {
         throw new ArgumentException(
            v3.n5("Prefix \"xml\" is reserved for use by XML and can be mapped only to namespace name \"http://www.w3.org/XML/1998/namespace\".")
         );
      }

      if (v8.n5(this.c8, var1)) {
         throw new ArgumentException(v3.n5("Prefix \"xmlns\" is reserved for use by XML."));
      }

      int var3 = this.k5(var1);
      int var4 = -1;
      if (var3 != -1) {
         if (this.n5[var3].k5 == this.u3) {
            this.n5[var3].l6 = var2;
            return;
         }

         var4 = var3;
      }

      if (this.l6 == this.n5.length - 1) {
         s2$n5[] var5 = (s2$n5[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(s2$n5.class), this.n5.length * 2)
         );
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0, this.n5.length);
         this.n5 = var5;
      }

      this.n5[++this.l6].n5(var1, var2, this.u3, var4);
      if (this.u9) {
         this.a6.set_Item(var1, this.l6);
      } else if (this.l6 >= 16) {
         this.a6 = new Dictionary<>(this.l6);

         for (int var8 = 0; var8 <= this.l6; var8++) {
            this.a6.set_Item(this.n5[var8].n5, var8);
         }

         this.u9 = true;
      }
   }

   @Override
   public IEnumerator iterator() {
      Dictionary var1 = new Dictionary(this.l6 + 1);

      for (int var2 = 0; var2 <= this.l6; var2++) {
         if (this.n5[var2].l6 != null) {
            var1.set_Item(this.n5[var2].n5, this.n5[var2].n5);
         }
      }

      return var1.getKeys().iterator();
   }

   @Override
   public IGenericDictionary<String, String> n5(int var1) {
      int var6 = 0;
      switch (var1) {
         case 0:
            var6 = 2;
            break;
         case 1:
            var6 = 3;
            break;
         case 2:
            var6 = this.l6;

            while (this.n5[var6].k5 == this.u3) {
               var6--;
            }

            var6++;
      }

      Dictionary var3 = new Dictionary(this.l6 - var6 + 1);

      while (var6 <= this.l6) {
         String var4 = this.n5[var6].n5;
         String var5 = this.n5[var6].l6;
         if (var5 != null) {
            if (var5.length() <= 0 && var4.length() <= 0 && var1 != 2) {
               var3.removeItemByKey(var4);
            } else {
               var3.set_Item(var4, var5);
            }
         }

         var6++;
      }

      return var3;
   }

   @Override
   public String n5(String var1) {
      int var2 = this.k5(var1);
      return var2 == -1 ? null : this.n5[var2].l6;
   }

   private int k5(String var1) {
      if (!this.u9) {
         for (int var6 = this.l6; var6 >= 0; var6--) {
            if (this.n5[var6].n5 == var1 && this.n5[var6].l6 != null) {
               return var6;
            }
         }

         for (int var7 = this.l6; var7 >= 0; var7--) {
            if (com.aspose.slides.ms.System.d1.a6(this.n5[var7].n5, var1) && this.n5[var7].l6 != null) {
               return var7;
            }
         }

         return -1;
      } else {
         int var2 = 0;
         Integer[] var3 = new Integer[]{var2};
         boolean var4 = this.a6.tryGetValue(var1, var3);
         var2 = var3[0];
         if (!var4) {
            return -1;
         }

         while (var2 != -1 && this.n5[var2].l6 == null) {
            var2 = this.n5[var2].u3;
         }

         return var2;
      }
   }

   @Override
   public String l6(String var1) {
      for (int var2 = this.l6; var2 >= 0; var2--) {
         if (com.aspose.slides.ms.System.d1.a6(this.n5[var2].l6, var1)) {
            String var3 = this.n5[var2].n5;
            if (com.aspose.slides.ms.System.d1.a6(this.n5(var3), var1)) {
               return var3;
            }
         }
      }

      return null;
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(s2$n5.class, new n2());
   }
}
