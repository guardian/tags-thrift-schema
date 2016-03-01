include "image.thrift"

namespace scala com.gu.tagmanagement

enum SponsorshipType {
    SPONSORED = 0,
    FOUNDATION = 1,
    PAID_CONTENT = 2
}

struct SponsorshipTargeting {
    /** only apply the sponsorship after this date */
    1: optional i64 publishedSince;

    /** only show the sponsorship for the listed editions */
    2: optional list<string> validEditions
}

struct Sponsorship {
    /** the type of the sponsorship */
    1: required SponsorshipType sponsorshipType;

    /** the name of the sponsor */
    2: required string sponsorName;

    /** the logo to display for the sponsor */
    3: required image.Image sponsorLogo;

    /** the url to link to when clicking the sponsor logo */
    4: required string sponsorLink;

    /** targeting information for the sponsorship, always show the sponsorship if this is missing */
    5: optional SponsorshipTargeting targeting;
}
