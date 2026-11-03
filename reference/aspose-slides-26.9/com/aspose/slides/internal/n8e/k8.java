package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

public class k8<Type1, Type2> {
   private final Dictionary<Type1, Type2> n5 = new Dictionary<>();
   private final Dictionary<Type2, Type1> l6 = new Dictionary<>();

   public void n5(Type1 var1, Type2 var2) {
      boolean var3 = this.n5.containsKey((Type1)var1);
      boolean var4 = this.l6.containsKey((Type2)var2);
      if (!var3) {
         this.n5.set_Item((Type1)var1, (Type2)var2);
      }

      if (!var4) {
         this.l6.set_Item((Type2)var2, (Type1)var1);
      }
   }

   public boolean n5(Type1 var1) {
      return this.n5.containsKey((Type1)var1);
   }

   public Type2 l6(Type1 var1, Type2 var2) {
      Object var3 = null;
      Object[] var4 = new Object[]{var3};
      boolean var5 = !this.n5.tryGetValue((Type1)var1, var4);
      var3 = var4[0];
      if (var5) {
         var3 = var2;
      }

      return (Type2)var3;
   }

   public Type2 l6(Type1 var1) {
      Object var2 = null;
      Object[] var3 = new Object[]{var2};
      boolean var4 = !this.n5.tryGetValue((Type1)var1, var3);
      var2 = var3[0];
      if (var4) {
         throw new IndexOutOfRangeException();
      } else {
         return (Type2)var2;
      }
   }

   public Type1 k5(Type2 var1) {
      Object var2 = null;
      Object[] var3 = new Object[]{var2};
      boolean var4 = !this.l6.tryGetValue((Type2)var1, var3);
      var2 = var3[0];
      if (var4) {
         throw new IndexOutOfRangeException();
      } else {
         return (Type1)var2;
      }
   }
}
