package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;

public abstract class BaseChartValue implements IBaseChartValue, r0g {
   private v1y l6;
   private int k5;
   private boolean u3;
   r0g n5;
   private Chart a6;

   @Override
   public final int getDataSourceType() {
      return this.l6 != null ? this.l6.n5() : this.k5;
   }

   @Override
   public final void setDataSourceType(int value) {
      if (!this.u3) {
         if (this.l6 != null) {
            this.l6.n5(value);
         } else {
            this.k5 = value;
         }
      } else {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "This BaseChartValue instance is created with ",
               "CentralizedTypeChangingRestriction and so DataSourceType is ",
               "centralized managed with dataSourceTypeHolder whitch is passed as parameter into constructor."
            })
         );
      }
   }

   @Override
   public abstract Object getData();

   @Override
   public abstract void setData(Object var1);

   BaseChartValue(r0g parentImmediate, v1y dataSourceTypeHolder, boolean centralizedTypeChangingRestriction) {
      if (this.u3 && dataSourceTypeHolder == null) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"centralizedTypeChangingRestriction paranenter is true ", "and so dataSourceTypeHolder can't be null"})
         );
      }

      this.n5 = parentImmediate;
      this.u3 = centralizedTypeChangingRestriction;
      this.l6 = dataSourceTypeHolder;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   final Chart n5() {
      if (this.a6 == null) {
         Chart[] var1 = new Chart[]{this.a6};
         d0u.n5(Chart.class, this.n5, var1);
         this.a6 = var1[0];
      }

      return this.a6;
   }
}
