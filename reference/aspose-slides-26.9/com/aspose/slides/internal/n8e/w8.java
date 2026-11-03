package com.aspose.slides.internal.n8e;

import com.aspose.slides.IWarningCallback;
import com.aspose.slides.IWarningInfo;

public abstract class w8 implements IWarningInfo {
   String n5;

   w8(String var1) {
      this.n5 = var1;
   }

   @Override
   public final void sendWarning(IWarningCallback receiver) {
      boolean var2 = false;
      if (receiver != null) {
         try {
            var2 = receiver.warning(this) == 1;
         } catch (RuntimeException var4) {
            v4.n5(var4);
         } catch (AssertionError var5) {
            v4.n5(var5);
         }
      }

      if (var2) {
         throw new n5(this);
      }
   }

   @Override
   public final String getDescription() {
      return this.n5;
   }
}
