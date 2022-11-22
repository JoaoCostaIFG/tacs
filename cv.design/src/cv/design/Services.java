package cv.design;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import cv.OrderedSection;
import cv.PhoneCountryCode;
import cv.PhoneNumber;
import cv.Section;
import cv.SectionLayer;

/**
 * The services class used by VSM.
 */
public class Services {
    public List<EObject> getAllSectionsOrdered(SectionLayer self) {
    	List<EObject> ret = new ArrayList<>();
    	Section identSection = self.getIdentificationSection();
    	if (identSection != null) {
    		ret.add(identSection);
    		ret.addAll(this.getAllSectionsOrdered(identSection));
    	}
    	
    	List<OrderedSection> subSections = new ArrayList<>(self.getSections());
    	subSections.sort(Comparator.comparingInt(OrderedSection::getOrder));
    	for (Section s : subSections) {
    		ret.add(s);
    		ret.addAll(this.getAllSectionsOrdered(s));
    	}
  
    	return ret;
    }

	private List<EObject> getAllSectionsOrdered(Section self) {
    	List<EObject> ret = new ArrayList<>();
    	
    	List<OrderedSection> subSections = new ArrayList<>(self.getSections());
    	subSections.sort(Comparator.comparingInt(OrderedSection::getOrder));
    	for (Section s : subSections) {
    		ret.add(s);
    		ret.addAll(this.getAllSectionsOrdered(s));
    	}
    	
    	return ret;
	}
	
	private Integer getCountryCode(PhoneNumber self) {
		return self.getCountryCode().getValue();
	}
}
