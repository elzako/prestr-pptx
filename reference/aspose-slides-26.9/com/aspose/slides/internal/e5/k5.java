package com.aspose.slides.internal.e5;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.v4;

public abstract class k5 implements com.aspose.slides.internal.r4.y4<Character>, v4, Cloneable {
   @Override
   public abstract boolean l6();

   public abstract char u3();

   public final Character a6() {
      return this.u3();
   }

   @Override
   public void n5() {
      throw new NotSupportedException();
   }

   public void n5(char var1) {
   }

   @Override
   public final Object deepClone() {
      return this.u9();
   }

   protected Object u9() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Character k5() {
      return this.a6();
   }

}
